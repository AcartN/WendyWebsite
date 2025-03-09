package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.margin
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

@Composable
fun Footer() {
    org.jetbrains.compose.web.dom.Footer(
        attrs = {
            style {
                width(100.percent)
            }
        },
    ) {
        Box(
            attrs = {
                style {
                    maxWidth(1440.px)
                    height(footerHeight)
                    margin(vertical = 0.px, horizontal = auto)
                    backgroundColor(WendyCSS.wendyBlue)
                    property("border-top-left-radius", 30.px)
                    property("border-top-right-radius", 30.px)
                }
            }
        ) {
            Patoune(
                attrs = {
                    align(Alignment2D.BottomEnd)
                },
            )
            TriColorBands(
                attrs = {
                    style {
                        align(Alignment2D.TopStart(start = 116.px))
                    }
                },
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(32.px, alignment = Alignment.CenterVertically),
                horizontalItemAlignment = Alignment.CenterHorizontally,
                attrs = {
                    align(Alignment2D.Center)
                },
            ) {
                FooterContent()
                Copyrights()
            }
        }
    }
}

val footerHeight = 326.px
