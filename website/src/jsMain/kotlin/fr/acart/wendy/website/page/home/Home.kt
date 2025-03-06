package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.FullLogo
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.page.BasicPage
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.marginHorizontal
import fr.acart.wendy.website.style.marginVertical
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun Home() {
    BasicPage(
        attrs = {
            style {
                backgroundColor(WendyCSS.pinkBg)
            }
        }
    ) {
        Column(
            attrs = {
                style {
                    width(100.percent)
                    backgroundColor(Color.tomato)
                }
            },
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalItemAlignment = Alignment.CenterHorizontally,
        ) {
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
                                maxWidth(1440.px)
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
            Row(
                attrs = {
                    style {
                        marginHorizontal(20.px)
                        marginVertical(50.px)
                        backgroundColor(Color.burlywood)
                    }
                },
                horizontalArrangement = Arrangement.spacedBy(20.px),
                verticalItemsAlignment = Alignment.CenterVertically,
                wrap = true,
            ) {
                repeat(10) {
                    Div(
                        attrs = {
                            style {
                                backgroundColor(Color.cyan)
                                borderRadius(100.percent)
                                height(250.px)
                                width(250.px)
                                alignContent(AlignContent.Center)
                                textAlign("center")
                            }
                        },
                    ) {
                        Text("Hello")
                    }
                    Div(
                        attrs = {
                            style {
                                backgroundColor(Color.gold)
                                borderRadius(5.percent)
                                height(100.px)
                                width(100.px)
                                alignContent(AlignContent.Center)
                                textAlign("center")
                            }
                        },
                    ) {
                        Text("World")
                    }
                }
            }
            Box(
                attrs = {
                    style {
                        backgroundColor(Color.beige)
                        height(600.px)
                        width(600.px)
                    }
                },
            ) {
                Div(
                    attrs = {
                        style {
                            align(Alignment2D.Center)
                            backgroundColor(Color.blueviolet)
                            height(200.px)
                            width(200.px)
                        }
                    },
                )
                Div(
                    attrs = {
                        style {
                            align(Alignment2D.Center)
                            backgroundColor(Color.tomato)
                            height(150.px)
                            width(150.px)
                        }
                    },
                )
                val alignments = listOf(
                    Alignment2D.BottomCenter to "BottomCenter",
                    Alignment2D.BottomEnd to "BottomEnd",
                    Alignment2D.BottomStart to "BottomStart",
                    Alignment2D.Center to "Center",
                    Alignment2D.CenterEnd to "CenterEnd",
                    Alignment2D.CenterStart to "CenterStart",
                    Alignment2D.TopCenter to "TopCenter",
                    Alignment2D.TopEnd to "TopEnd",
                    Alignment2D.TopStart to "TopStart",
                )
                for ((alignment, name) in alignments) {
                    Div(
                        attrs = {
                            style {
                                align(alignment)
                                backgroundColor(Color.darkgray)
                                height(100.px)
                                width(100.px)
                                textAlign("center")
                                alignContent(AlignContent.Center)
                            }
                        },
                    ) {
                        Text(name)
                    }
                }
                Div(
                    attrs = {
                        style {
                            align(Alignment2D.TopEnd(end = 100.px, top = 100.px))
                            backgroundColor(Color.darkgray)
                            height(100.px)
                            width(100.px)
                            textAlign("center")
                            alignContent(AlignContent.Center)
                        }
                    },
                ) {
                    Text("TopEnd with offset")
                }
            }
        }
    }
}

@Composable
fun HookText() {
    Div(
        attrs = {
            style {
                color(WendyCSS.wendyBlue)
                fontFamily("Lemon Milk", "sans-serif")
                fontWeight("bold")
                fontSize(34.px)
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
