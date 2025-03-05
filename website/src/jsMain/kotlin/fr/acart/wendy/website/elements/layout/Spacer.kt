package fr.acart.wendy.website.elements.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun Spacer(
    width: CSSNumeric,
    height: CSSNumeric,
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
) {
    Div(
        attrs = {
            attrs?.invoke(this)
            style {
                width(width)
                height(height)
            }
        },
    )
}

@Composable
fun Spacer(
    size: CSSNumeric,
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
) {
    Spacer(
        width = size,
        height = size,
        attrs = attrs,
    )
}
