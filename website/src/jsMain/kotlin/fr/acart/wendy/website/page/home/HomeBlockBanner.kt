package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.FullLogo
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun HomeBlockBanner() {
    Column(
        attrs = {
            style {
                width(100.percent)
            }
        },
    ) {
        Banner()
        TitleDivider()
    }
}

@Composable
fun Banner() {
    Box(
        attrs = {
            style {
                height(600.px)
                width(100.percent)
                background("linear-gradient(90deg, rgba(241,255,255,1) 0%, rgba(227,245,255,1) 66%, rgba(226,244,255,1) 100%)")
            }
        },
    ) {
        Box(
            attrs = {
                style {
                    align(Alignment2D.Center)
                    height(100.percent)
                    maxWidth(1440.px)
                }
            },
        ) {
            Img(
                src = "/hp_cat_no_bg_1.png",
                alt = "Cute Cat",
                attrs = {
                    style {
                        align(Alignment2D.BottomCenter)
                        height(600.px)
                        width(100.percent)
                        property("object-fit", "cover")
                    }
                },
            )
            Row(
                attrs = {
                    style {
                        align(Alignment2D.CenterStart(start = 116.px))
                    }
                },
                horizontalArrangement = Arrangement.spacedBy(32.px),
                verticalItemsAlignment = Alignment.CenterVertically,
            ) {
                FullLogo(
                    attrs = {
                        style {
                            align(Alignment2D.BottomCenter)
                        }
                    },
                )
                HookText()
            }
        }
    }
}

@Composable
fun TitleDivider() {
    Text(
        attrs = {
            style {
                width(100.percent)
                height(70.px)
                backgroundColor(WendyCSS.wendyBlue)
                textAlign("center")
                alignContent(AlignContent.Center)
            }
        },
        text = "Wendy Henault | Comportementaliste félin",
        textStyle = TextStyle.CapH2,
        color = Color.white,
    )
}

@Composable
fun HookText() {
    Div(
        attrs = {
            style {
                color(WendyCSS.wendyBlue)
                with(TextStyle.CapH1) {
                    applyStyle()
                }
            }
        },
    ) {
        Text("Une communication")
        Br()
        Text("sans griffes")
        Br()
        Text("avec votre chat !")
    }
}
