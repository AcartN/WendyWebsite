package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.marginHorizontal
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun Profile() {
    Column(
        attrs = {
            style {
                width(510.px)
                height(773.px)
            }
        },
        horizontalItemAlignment = Alignment.CenterHorizontally,
    ) {
        Img(
            src = "/profile_wendy.png",
            alt = "Profile Picture",
            attrs = {
                style {
                    width(100.percent)
                    height(524.px)
                    property("border-top-left-radius", "20px")
                    property("border-top-right-radius", "20px")
                    property("object-fit", "cover")
                }
            }
        )
        Div(
            attrs = {
                style {
                    width(100.percent)
                    height(14.px)
                    backgroundColor(Color.white)
                }
            }
        )
        Column(
            attrs = {
                style {
                    width(509.px)
                    height(263.px)
                    backgroundColor(WendyCSS.wendyBlue)
                    property("border-bottom-left-radius", "20px")
                    property("border-bottom-right-radius", "20px")
                }
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(32.px, alignment = Alignment.CenterVertically),
        ) {
            Div(
                attrs = {
                    style {
                        color(Color.white)
                        textAlign("center")
                        fontFamily("Baloo", "sans-serif")
                        fontWeight("regular")
                        fontSize(22.px)
                        marginHorizontal(71.px)
                    }
                }
            ) {
                Text("J’interviens dans l’ensemble du département de la Vienne (86) mais je suis également disponible en visioconférence.")
            }
            NavLink(
                href = "/contact",
                attrs = {
                    classes(WendyCSS.hoverUnderline)
                    style {
                        color(WendyCSS.lila)
                        textAlign("center")
                        fontFamily("Baloo", "sans-serif")
                        fontSize(20.px)
                    }
                }
            ) {
                Text("@wendy_comportementaliste86")
            }
        }
    }
}