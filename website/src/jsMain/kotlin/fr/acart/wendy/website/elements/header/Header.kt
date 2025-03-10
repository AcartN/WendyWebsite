package fr.acart.wendy.website.elements.header

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.Navigation.navigateTo
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.UnorderedList
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
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
                position(Position.Sticky)
                top(0.px)
                zIndex(10)
                minWidth(100.percent)
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
                    width(1440.px)
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
                    src = Images.logo,
                    alt = Strings.altLogo,
                    attrs = {
                        onClick {
                            navigateTo("/")
                        }
                        style {
                            width(100.percent)
                            marginHorizontal(auto)
                        }
                        classes(WendyCSS.hoverMegaZoom)
                        title(Strings.minou)
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
                                with(TextStyle.Action1) {
                                    applyStyle()
                                }
                            }
                        }
                    ) {
                        NavItem(href = "#", text = Strings.navWhoAmI)
                        NavItem(href = "#", text = Strings.navWhenToConsult)
                        NavItem(href = "#", text = Strings.navServices)
                        NavItem(href = "#", text = Strings.navTestimonials)
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
                    src = Images.contactMe,
                    alt = Strings.altContactIcon,
                    attrs = {
                        onClick {
                            navigateTo("/contact")
                        }
                        style {
                            width(41.px)
                            height(31.px)
                            marginHorizontal(auto)
                        }
                        classes(WendyCSS.hoverMegaZoom)
                        title(Strings.navContactMe)
                    },
                )
            }
        }
    }
}

val headerHeight = 102.px + 4.px
