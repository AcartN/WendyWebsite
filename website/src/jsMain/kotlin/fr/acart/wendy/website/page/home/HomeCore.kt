package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.marginHorizontal
import fr.acart.wendy.website.style.marginStart
import fr.acart.wendy.website.style.marginVertical
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun HomeCore() {
    Column(
        attrs = {
            style {
                marginVertical(94.px)
                width(100.percent)
            }
        },
        horizontalItemAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(94.px, alignment = Alignment.CenterVertically),
    ) {
        SectionPresentation()
        SectionTestimonial()
    }
}

@Composable
fun SectionTestimonial() {
    Column(
        attrs = {
            style {
                width(1440.px)
            }
        },
        horizontalItemAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(94.px, alignment = Alignment.CenterVertically),
    ) {
        TestimonialTitle()
        Row(
            attrs = {
                style {
                    width(100.percent)
                }
            },
            horizontalArrangement = Arrangement.spacedBy(60.px, alignment = Alignment.CenterHorizontally),
            verticalItemsAlignment = Alignment.CenterVertically,
        ) {
            val testimonials = listOf(
                Pair("/loupa.png", "Loupa"),
                Pair("/pops.png", "Pops"),
                Pair("/snickers.png", "Snickers"),
            )
            for ((index, testimonial) in testimonials.withIndex()) {
                Testimonial(
                    imgSrc = testimonial.first,
                    nickname = testimonial.second,
                    hasLurkingCat = index % 2 == 1,
                )
            }
        }
        NavLink(
            href = "/testimonials",
            attrs = {
                classes(WendyCSS.hoverUnderline)
                style {
                    width(340.px)
                    height(50.px)
                    marginHorizontal(auto)
                    alignContent(AlignContent.Center)
                    textAlign("center")
                    fontFamily("Lemon Milk", "sans-serif")
                    fontWeight("bold")
                    fontSize(16.px)
                    color(Color.white)
                    backgroundColor(WendyCSS.wendyBlue)
                    borderRadius(20.px)
                }
            }
        ) {
            Text("Découvrir les témoignages")
        }
    }
}

@Composable
fun TestimonialTitle() {
    Box(
        attrs = {
            style {
                marginStart(114.px)
                width(624.px)
                height(64.px)
                borderRadius(15.px)
                backgroundColor(WendyCSS.lila)
            }
        },
    ) {
        Div(
            attrs = {
                style {
                    align(Alignment2D.CenterStart(start = 64.px))
                    height(100.percent)
                    width(20.px)
                    backgroundColor(Color.white)
                }
            }
        )
        Div(
            attrs = {
                style {
                    align(Alignment2D.CenterStart(start = 89.px))
                    height(100.percent)
                    width(20.px)
                    backgroundColor(WendyCSS.wendyGreen)
                }
            }
        )
        Div(
            attrs = {
                style {
                    align(Alignment2D.CenterStart(start = 204.px))
                    fontFamily("Lemon Milk", "sans-serif")
                    fontWeight("bold")
                    fontSize(18.px)
                    color(WendyCSS.wendyBlue)
                }
            }
        ) {
            Text("Vos témoignages")
        }
    }
}

@Composable
fun Testimonial(imgSrc: String, nickname: String, hasLurkingCat: Boolean) {
    Box(
        attrs = {
            style {
                width(366.px)
                height(506.px)
            }
        },
    ) {
        Column(
            attrs = {
                align(Alignment2D.BottomCenter)
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.px, alignment = Alignment.CenterVertically),
        ) {
            TestimonialImage(imgSrc)
            TestimonialNickname(nickname)
        }
        Img(
            src = if (hasLurkingCat) "/cat_badge_2.svg" else "/cat_badge_1.svg",
            alt = "Cute Cat",
            attrs = {
                style {
                    align(Alignment2D.TopStart)
                    marginTop(50.px)
                    width(126.px)
                }
            },
        )
        if (hasLurkingCat) {
            Img(
                src = "/cat_lurking.svg",
                alt = "Cat lurking",
                attrs = {
                    style {
                        align(Alignment2D.TopCenter)
                        width(170.px)
                    }
                },
            )
        }
    }
}

@Composable
fun TestimonialImage(imgSrc: String) {
    Img(
        src = imgSrc,
        alt = "Cute Cat",
        attrs = {
            style {
                width(366.px)
                height(360.px)
                property("border-top-left-radius", 100.percent)
                property("border-top-right-radius", 100.percent)
                property("border-bottom-left-radius", 20.px)
                property("border-bottom-right-radius", 20.px)
            }
        },
    )
}


@Composable
fun TestimonialNickname(nickname: String) {
    Box(
        attrs = {
            style {
                width(366.px)
                height(51.px)
                borderRadius(10.px)
                backgroundColor(Color.white)
            }
        },
    ) {
        Div(
            attrs = {
                style {
                    align(Alignment2D.CenterStart(start = 25.px))
                    height(100.percent)
                    width(20.px)
                    backgroundColor(WendyCSS.wendyGreen)
                }
            }
        )
        Div(
            attrs = {
                style {
                    align(Alignment2D.CenterStart(start = 50.px))
                    height(100.percent)
                    width(20.px)
                    backgroundColor(WendyCSS.wendyBlue)
                }
            }
        )
        Div(
            attrs = {
                style {
                    align(Alignment2D.Center)
                    fontFamily("Lemon Milk", "sans-serif")
                    fontWeight("bold")
                    fontSize(18.px)
                    color(WendyCSS.wendyBlue)
                }
            }
        ) {
            Text(nickname)
        }
    }
}
