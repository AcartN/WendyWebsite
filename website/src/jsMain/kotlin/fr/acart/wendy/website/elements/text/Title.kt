package fr.acart.wendy.website.elements.text

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.borderRadius
import fr.acart.wendy.website.style.paddingHorizontal
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.w3c.dom.HTMLDivElement

@Composable
fun Title(
    attrs: AttrBuilderContext<HTMLDivElement>?,
    title: String,
    reverse: Boolean = false,
    contentColor: CSSColorValue,
    backgroundColor: CSSColorValue,
) {
    Row(
        reverse = reverse,
        horizontalArrangement = Arrangement.spacedBy(40.px),
        verticalItemsAlignment = Alignment.CenterVertically,
        attrs = {
            attrs?.invoke(this)
            style {
                width(496.px)
                height(64.px)
                borderRadius(15.px)
                paddingHorizontal(64.px)
                backgroundColor(backgroundColor)
            }
        },
    ) {
        BiColorBands(
            colors = listOf(Color.white, WendyCSS.wendyGreen),
        )
        Text(
            text = title,
            textStyle = TextStyle.CapH3,
            color = contentColor,
        )
    }
}