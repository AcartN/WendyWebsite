package fr.acart.wendy.website

import androidx.compose.runtime.*
import fr.acart.wendy.website.MyCSS.wendyBlue
import fr.acart.wendy.website.Navigation.navigateBack
import fr.acart.wendy.website.Navigation.navigateTo
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.style.*
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposableInBody
import org.w3c.dom.events.Event

val headerHeight = 102.px + 4.px
val footerHeight = 326.px

object MyCSS : StyleSheet() {
    val lila = Color("#f8d7f9")
    val wendyBlue = Color("#0b033b")
    val wendyGreen = Color("#7eb8b5")
    val pinkBg = Color("#ffedff")
    val navbar by style {
        position(Position.Fixed)
        width(100.percent)
        padding(24.px)
        top(0.px)
        backgroundColor(rgba(255, 255, 255, 0.8))
        borderBottom(width = 4.px, style = LineStyle.Solid, color = lila)
        blur(5.px)
        zIndex(10)
    }
    val hoverZoom by style {
        cursor("pointer")
        property("transition", "transform 0.2s ease-in-out")
        self + hover style {
            scale(1.1)
        }
    }
    val hoverUnderline by style {
        textDecoration("none")
        self + hover style {
            textDecoration("underline")
        }
    }

    val mainContainer by style {
        margin(0.px)
        width(100.percent)
        minHeight(100.vh - headerHeight - footerHeight)
        backgroundColor(pinkBg)
    }
    val navLink by style {
        textDecoration("none")
        color(wendyBlue)
    }
}

@Composable
fun Footer() {
    Div(
        attrs = {
            style {
                color(Color.white)
                backgroundColor(wendyBlue)
                width(100.percent)
            }
        }
    ) {
        Box(
            attrs = {
                style {
                    width(1200.px)
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
                for (color in listOf(Color.white, MyCSS.wendyGreen, MyCSS.lila)) {
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
                    for (color in listOf(Color.white, MyCSS.wendyGreen, MyCSS.lila)) {
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
                        classes(MyCSS.hoverUnderline)
                        style {
                            color(Color.white)
                            fontSize(16.px)
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

fun main() {
    renderComposableInBody {
        Style(MyCSS)
        Header()
        Column(
            attrs = {
                style {
                    width(100.percent)
                    minHeight(100.vh)
                }
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(
                width = 100.percent,
                height = headerHeight,
            )
            MainContent()
            Footer()
        }
    }
}

@Composable
fun Header() {
    Header(
        attrs = { classes(MyCSS.navbar) }
    ) {
        Div(
            attrs = {
                style {
                    gap(40.px)
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    flexDirection(FlexDirection.Row)
                }
            }
        ) {
            Img(
                src = "logo.svg",
                alt = "Logo du site : un chat",
                attrs = {
                    onClick {
                        navigateTo("/")
                    }
                    style {
                        width(72.px)
                        height(54.px)
                    }
                    classes(MyCSS.hoverZoom)
                    title("Minou")
                },
            )
            Nav {
                Ul(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            justifyContent(JustifyContent.Center)
                            listStyle("none")
                            padding(0.px)
                            margin(0.px)
                            gap(40.px)
                            fontSize(20.px)
                            fontFamily("Baloo", "sans-serif")
                            property("text-transform", "uppercase")
                        }
                    }
                ) {
                    Li(attrs = { classes(MyCSS.hoverUnderline) }) { A(href = "#", attrs = { classes(MyCSS.navLink) }) { Text("QU’EST CE QU’UN COMPORTEMENTALISTE ?") } }
                    Li(attrs = { classes(MyCSS.hoverUnderline) }) { A(href = "#", attrs = { classes(MyCSS.navLink) }) { Text("quand me consulter ?") } }
                    Li(attrs = { classes(MyCSS.hoverUnderline) }) { A(href = "#", attrs = { classes(MyCSS.navLink) }) { Text("PRESTATIONS") } }
                    Li(attrs = { classes(MyCSS.hoverUnderline) }) { A(href = "#", attrs = { classes(MyCSS.navLink) }) { Text("témoignages") } }
                }
            }
            Img(
                src = "contact_me.svg",
                alt = "Icône de contact",
                attrs = {
                    onClick {
                        navigateTo("/contact")
                    }
                    style {
                        width(41.px)
                        height(31.px)
                    }
                    classes(MyCSS.hoverZoom)
                    title("Me contacter")
                },
            )
        }
    }
}

@Composable
fun MainContent() {
    Main(
        attrs = {
            classes(MyCSS.mainContainer)
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


fun test() {
    renderComposableInBody {
        var currentPath by remember { mutableStateOf(window.location.pathname) }
        var count by remember { mutableStateOf(0) }
        Div {
            Img(
                src = "/hp_cat_no_bg_1.webp",
                alt = "Cute Cat",
                attrs = {
                    style {
                        backgroundColor(Color.cyan)
                    }
                },
            )
        }
        Div {
            Text("Hello, World!")
        }
        Button(attrs = { onClick { count++ } }) {
            Text("I've been clicked $count times")
        }
        Button(attrs = { onClick { window.location.pathname = "/next" } }) {
            Text("Go to the next page")
        }
        Button(attrs = {
            onClick {
                navigateTo("/next")
            }
        }) {
            Text("Go to the next page with history")
        }
        if (currentPath == "/next") {
            Div {
                Text("You are on the next page!")
            }
            Button(attrs = { onClick { navigateBack() } }) {
                Text("Go back")
            }
        }
        LaunchedEffect("pathListener") {
            console.log("Listening to path changes")
            window.addEventListener("popstate", {
                window.dispatchEvent(Event("locationchange"))
            })
            window.addEventListener("locationchange", {
                currentPath = window.location.pathname
                console.log("Path changed to $currentPath")
            })
        }
    }
}

object Navigation {
    fun navigateTo(path: String) {
        window.history.pushState(data = null, title = path, url = path)
        window.dispatchEvent(Event("locationchange"))
    }
    fun navigateReplace(path: String) {
        window.history.replaceState(data = null, title = path, url = path)
        window.dispatchEvent(Event("locationchange"))
    }
    fun navigateBack() {
        window.history.back()
    }
    fun navigateForward() {
        window.history.forward()
    }
    fun refresh() {
        window.location.reload()
    }
    fun getCurrentPathName(): String {
        return window.location.pathname
    }
}

