package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.style.fillMaxHeight
import fr.acart.wendy.website.style.fillMaxWidth
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.w3c.dom.HTMLDivElement

@Composable
fun Column(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalItemAlignment: Alignment.Horizontal = Alignment.Start,
    horizontalContentAlignment: Alignment.Horizontal = horizontalItemAlignment,
    wrap: Boolean = false,
    fillHeight: Boolean = false,
    fillWidth: Boolean = false,
    content: ContentBuilder<HTMLDivElement>?,
) {
    Flex(
        direction = FlexDirection.Column,
        attrs = {
            classes("column")
            style {
                if (fillHeight) fillMaxHeight()
                if (fillWidth) fillMaxWidth()
            }
            attrs?.invoke(this)
        },
        justifyContent = verticalArrangement.value,
        columnGap = verticalArrangement.flowGap,
        rowGap = verticalArrangement.spacedBy,
        alignItems = horizontalItemAlignment.alignItems,
        alignContent = horizontalContentAlignment.alignContent,
        flexWrap = if (wrap) FlexWrap.Wrap else FlexWrap.Nowrap,
        content = content,
    )
}
