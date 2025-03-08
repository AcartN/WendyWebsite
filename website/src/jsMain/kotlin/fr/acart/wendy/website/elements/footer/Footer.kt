package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.margin
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
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
            Img(
                src = "/patoune.svg",
                alt = "Patoune",
                attrs = {
                    style {
                        align(Alignment2D.BottomEnd)
                    }
                },
            )
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
                    verticalItemsAlignment = Alignment.Top,
                ) {
                    FooterDetails(
                        title = "Me Contacter :",
                        details = listOf(
                            Detail("/contact_me_white.svg", "Contact Me", "wendycomportementaliste86@gmail.com"),
                            Detail("/phone_white.svg", "Phone", "xx.xx.xx.xx.xx")
                        ),
                    )
                    Img(
                        src = "/full_logo_pink.svg",
                        alt = "Logo",
                        attrs = {
                            style {
                                width(155.px)
                                height(148.px)
                            }
                        },
                    )
                    FooterDetails(
                        title = "Me Suivre :",
                        details = listOf(
                            Detail("/instagram_white.svg", "Instagram", "@wendy_comportementaliste86"),
                        ),
                    )
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

data class Detail(
    val imgSrc: String,
    val alt: String,
    val text: String,
)

@Composable
fun FooterDetails(
    title: String,
    details: List<Detail>,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.px, alignment = Alignment.CenterVertically),
        horizontalItemAlignment = Alignment.Start,
    ) {
        FooterTitle(title)
        for (footerDetail in details) {
            FooterDetail(
                imgSrc = footerDetail.imgSrc,
                alt = footerDetail.alt,
                text = footerDetail.text,
            )
        }
    }
}

@Composable
fun FooterDetail(
    imgSrc: String,
    alt: String,
    text: String,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(15.px),
        verticalItemsAlignment = Alignment.CenterVertically,
    ) {
        Img(
            src = imgSrc,
            alt = alt,
            attrs = {
                style {
                    width(37.px)
                }
            },
        )
        Div(
            attrs = {
                style {
                    color(Color.white)
                    fontSize(14.px)
                    fontFamily("Baloo", "sans-serif")
                }
            }
        ) {
            Text(text)
        }
    }
}

@Composable
fun FooterTitle(title: String) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.InlineBlock)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    fontFamily("Lemon Milk", "sans-serif")
                    fontWeight("bold")
                    fontSize(25.px)
                    color(Color.white)
                }
            }
        ) {
            Text(title)
        }
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

val footerHeight = 326.px
