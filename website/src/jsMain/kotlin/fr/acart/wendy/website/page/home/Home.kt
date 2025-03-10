package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.page.BasicPage
import fr.acart.wendy.website.page.home.banner.Banner
import fr.acart.wendy.website.page.home.presentation.PresentationBlock
import fr.acart.wendy.website.page.home.testimonials.TestimonialBlock
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.marginHorizontal
import fr.acart.wendy.website.style.marginVertical
import fr.acart.wendy.website.style.paddingVertical
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
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
        Banner()
        TitleDivider()
        Column(
            attrs = {
                style {
                    paddingVertical(94.px)
                    width(100.percent)
                }
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(94.px, alignment = Alignment.CenterVertically),
        ) {
            PresentationBlock()
            TestimonialBlock()
        }
    }
}

@Composable
fun TestHTML() {
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
