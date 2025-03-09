package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun TriColorBands(
    attrs: AttrBuilderContext<HTMLDivElement>?,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.px),
        attrs = {
            attrs?.invoke(this)
            style {
                height(100.percent)
            }
        },
    ) {
        for (color in listOf(Color.white, WendyCSS.wendyGreen, WendyCSS.lila)) {
            Div(
                attrs = {
                    style {
                        height(100.percent)
                        width(13.px)
                        backgroundColor(color)
                    }
                }
            )
        }
    }
}