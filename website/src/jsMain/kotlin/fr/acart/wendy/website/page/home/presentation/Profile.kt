package fr.acart.wendy.website.page.home.presentation

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.borderRadiusBottom
import fr.acart.wendy.website.style.borderRadiusTop
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
                height(701.px)
            }
        },
        horizontalItemAlignment = Alignment.CenterHorizontally,
    ) {
        Img(
            src = Images.profileWendy,
            alt = Strings.altProfilePicture,
            attrs = {
                style {
                    width(100.percent)
                    height(424.px)
                    borderRadiusTop(20.px)
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
                    borderRadiusBottom(20.px)
                }
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(32.px, alignment = Alignment.CenterVertically),
        ) {
            Text(
                attrs = {
                    style {
                        textAlign("center")
                        marginHorizontal(71.px)
                    }
                },
                text = Strings.shortPresentation,
                textStyle = TextStyle.TextDefault1,
                color = Color.white,
            )
            NavLink(
                href = "/contact",
                textStyle = TextStyle.Action1,
                textColor = WendyCSS.lila,
                attrs = {
                    classes(WendyCSS.hoverUnderline)
                }
            ) {
                Text(Strings.wendyInstagram)
            }
        }
    }
}