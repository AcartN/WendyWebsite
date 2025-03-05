package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.AttrsScope
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun Box(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    content: @Composable BoxScope.() -> Unit,
) {
    val boxScope = BoxScopeInternal()
    Div(
        attrs = {
            classes("box")
            attrs?.invoke(this)
            style {
                display(DisplayStyle.Grid)
            }
        },
        content = {
            content(boxScope)
        },
    )
}

interface BoxScope {
    fun StyleScope.align(
        alignment2D: Alignment2D,
    )

    fun AttrsScope<*>.align(
        alignment2D: Alignment2D,
    ) {
        style {
            gridColumn("1")
            gridRow("1")
            with(alignment2D) {
                place()
            }
        }
    }
}

private class BoxScopeInternal : BoxScope {
    override fun StyleScope.align(
        alignment2D: Alignment2D,
    ) {
        gridColumn("1")
        gridRow("1")
        with(alignment2D) {
            place()
        }
    }
}
