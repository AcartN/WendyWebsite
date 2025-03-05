package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun Flex(
    direction: FlexDirection,
    flexWrap: FlexWrap = FlexWrap.Nowrap,
    justifyContent: JustifyContent = JustifyContent.FlexStart,
    alignItems: AlignItems = AlignItems.FlexStart,
    alignContent: AlignContent = AlignContent.FlexStart,
    gap: CSSNumeric? = null,
    rowGap: CSSNumeric? = null,
    columnGap: CSSNumeric? = null,
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    content: ContentBuilder<HTMLDivElement>?,
) {
    Div(
        attrs = {
            attrs?.invoke(this)
            style {
                display(DisplayStyle.Flex)
                flexDirection(direction)
                flexWrap(flexWrap)
                justifyContent(justifyContent)
                alignItems(alignItems)
                alignContent(alignContent)
                val finalRowGap = rowGap ?: gap ?: 0.px
                val finalColumnGap = columnGap ?: gap ?: 0.px
                gap(rowGap = finalRowGap, columnGap = finalColumnGap)
            }
        },
        content = content,
    )
}
