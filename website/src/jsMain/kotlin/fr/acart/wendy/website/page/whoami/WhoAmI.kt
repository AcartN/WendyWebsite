package fr.acart.wendy.website.page.whoami

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.TitleDivider
import fr.acart.wendy.website.page.BasicPage
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun WhoAmI() {
    BasicPage(
        attrs = {
            style {
                backgroundColor(WendyCSS.pinkBg)
            }
        },
    ) {
        Banner()
        TitleDivider()
    }
}

@Composable
fun Banner() {
    Div(
        attrs = {
            style {
                width(100.percent)
                height(600.px)
            }
        },
    ) {
        Img(
            src = Images.whoAmIBanner,
            alt = Strings.altCuteCat,
            attrs = {
                style {
                    width(100.percent)
                    height(100.percent)
                    property("object-fit", "cover")
                }
            },
        )
    }
}