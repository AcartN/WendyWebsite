package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
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
    reverse: Boolean = false,
    content: ContentBuilder<HTMLDivElement>?,
) {
    Flex(
        direction = if (reverse) FlexDirection.ColumnReverse else FlexDirection.Column,
        attrs = {
            classes("column")
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
