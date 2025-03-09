package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun FooterTitle(title: String) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.InlineBlock)
            }
        }
    ) {
        Text(
            textStyle = TextStyle.CapH2,
            text = title,
            color = Color.white,
        )
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Block)
                    width(100.percent)
                    height(13.px)
                    borderRadius(10.px)
                    backgroundColor(WendyCSS.lila)
                }
            }
        )
    }
}