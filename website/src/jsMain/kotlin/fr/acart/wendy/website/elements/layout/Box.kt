package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.style.*
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.ElementScope
import org.w3c.dom.HTMLDivElement

@Composable
fun Box(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    contentAlignment: Alignment2D = Alignment2D.TopStart,
    fillHeight: Boolean = false,
    fillWidth: Boolean = false,
    content: BoxScope.() -> Unit,
) {
    Div(
        attrs = {
            classes("box")
            attrs?.invoke(this)
            style {
                if (fillHeight) fillMaxHeight()
                if (fillWidth) fillMaxWidth()
                display(DisplayStyle.Grid)
            }
        }
    ) {
        val defaultAlignment = contentAlignment
        val items = mutableListOf<ContentBuilder<HTMLDivElement>>()
        fun newItem(
            attrs: AttrBuilderContext<HTMLDivElement>?,
            item: ContentBuilder<HTMLDivElement>?,
            alignment2D: Alignment2D?,
        ) {
            items.add {
                Div(
                    attrs = {
                        attrs?.invoke(this)
                        style {
                            gridColumn("1")
                            gridRow("1")
                            with(alignment2D ?: defaultAlignment) {
                                place()
                            }
                        }
                    },
                    content = item,
                )
            }
        }

        object : BoxScope {
            override fun item(
                attrs: AttrBuilderContext<HTMLDivElement>?,
                fillHeight: Boolean,
                fillWidth: Boolean,
                contentAlignment: Alignment2D?,
                content: ContentBuilder<HTMLDivElement>?,
            ) {
                newItem(
                    attrs = {
                        attrs?.invoke(this)
                        style {
                            if (fillHeight) fillMaxHeight()
                            if (fillWidth) fillMaxWidth()
                        }
                    },
                    item = content,
                    alignment2D = contentAlignment,
                )
            }
        }.apply(content)

        items.forEach { element ->
            element()
        }
    }
}

interface BoxScope {
    fun item(
        attrs: AttrBuilderContext<HTMLDivElement>? = null,
        fillHeight: Boolean = false,
        fillWidth: Boolean = false,
        contentAlignment: Alignment2D? = null,
        content: ContentBuilder<HTMLDivElement>? = null,
    )
}
