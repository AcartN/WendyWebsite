package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.margin
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer() {
    org.jetbrains.compose.web.dom.Footer(
        attrs = {
            style {
                backgroundColor(WendyCSS.wendyBlue)
                width(100.percent)
            }
        }
    ) {
        Box(
            attrs = {
                style {
                    maxWidth(1440.px)
                    height(footerHeight)
                    margin(vertical = 0.px, horizontal = auto)
                }
            }
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.px),
                attrs = {
                    style {
                        align(Alignment2D.TopStart(start = 116.px))
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
            Column(
                verticalArrangement = Arrangement.spacedBy(32.px, alignment = Alignment.CenterVertically),
                horizontalItemAlignment = Alignment.CenterHorizontally,
                attrs = {
                    align(Alignment2D.Center)
                },
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(64.px),
                ) {
                    for (color in listOf(Color.white, WendyCSS.wendyGreen, WendyCSS.lila)) {
                        Div(
                            attrs = {
                                style {
                                    height(100.px)
                                    width(100.px)
                                    backgroundColor(color)
                                }
                            }
                        )
                    }
                }
                NavLink(
                    href = "/koala",
                    attrs = {
                        classes(WendyCSS.hoverUnderline)
                        style {
                            color(Color.white)
                            fontSize(20.px)
                            fontFamily("Baloo", "sans-serif")
                        }
                    },
                ) {
                    Text("© Wendy Henault | Comportementaliste du chat - 2025 Tous droits réservés - CGV - Mentions Légales")
                }
            }
        }
    }
}

val footerHeight = 326.px
