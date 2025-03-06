package fr.acart.wendy.website.elements.header

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.Navigation.navigateTo
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.UnorderedList
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.style.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Header() {
    org.jetbrains.compose.web.dom.Header(
        attrs = {
            style {
                position(Position.Absolute)
                top(0.px)
                zIndex(10)
                minWidth(1440.px)
                paddingTop(24.px)
                paddingBottom(24.px)
                backgroundColor(rgba(255, 255, 255, 0.8))
                blur(5.px)
                borderBottom(width = 4.px, style = LineStyle.Solid, color = WendyCSS.lila)
            }
        }
    ) {
        Row(
            attrs = {
                style {
                    marginHorizontal(auto)
                    maxWidth(1440.px)
                }
            },
            verticalItemsAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(64.px, alignment = Alignment.CenterHorizontally),
        ) {
            NavLink(
                href = "/",
                attrs = {
                    style {
                        width(75.px)
                        textAlign("center")
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
                            marginHorizontal(auto)
                        }
                        classes(WendyCSS.hoverZoom)
                        title("Minou")
                    },
                )
            }
            Row(
                verticalItemsAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.px),
            ) {
                Nav {
                    UnorderedList(
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
                                letterSpacing(0.percent)
                                property("text-transform", "uppercase")
                            }
                        }
                    ) {
                        NavItem(href = "#", text = "Qu'est-ce qu'un comportementaliste ?")
                        NavItem(href = "#", text = "Quand me consulter ?")
                        NavItem(href = "#", text = "Prestations")
                        NavItem(href = "#", text = "Témoignages")
                    }
                }
            }
            NavLink(
                href = "/contact",
                attrs = {
                    style {
                        width(75.px)
                        textAlign("center")
                    }
                },
            ) {
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
                            marginHorizontal(auto)
                        }
                        classes(WendyCSS.hoverZoom)
                        title("Me contacter")
                    },
                )
            }
        }
    }
}

val headerHeight = 102.px + 4.px
