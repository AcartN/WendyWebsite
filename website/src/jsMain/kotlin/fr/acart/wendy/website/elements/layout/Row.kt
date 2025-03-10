package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.w3c.dom.HTMLDivElement

@Composable
fun Row(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalItemsAlignment: Alignment.Vertical = Alignment.Top,
    verticalContentAlignment: Alignment.Vertical = Alignment.Top,
    wrap: Boolean = false,
    reverse: Boolean = false,
    content: ContentBuilder<HTMLDivElement>?,
) {
    Flex(
        direction = if (reverse) FlexDirection.RowReverse else FlexDirection.Row,
        attrs = {
            classes("row")
            attrs?.invoke(this)
        },
        justifyContent = horizontalArrangement.value,
        rowGap = horizontalArrangement.flowGap,
        columnGap = horizontalArrangement.spacedBy,
        alignItems = verticalItemsAlignment.alignItems,
        alignContent = verticalContentAlignment.alignContent,
        flexWrap = if (wrap) FlexWrap.Wrap else FlexWrap.Nowrap,

        content = content,
    )
}
