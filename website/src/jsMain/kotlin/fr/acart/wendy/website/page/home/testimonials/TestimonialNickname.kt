package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment2D
import fr.acart.wendy.website.elements.layout.Box
import fr.acart.wendy.website.elements.text.BiColorBands
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.borderRadius
import org.jetbrains.compose.web.css.*

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
        BiColorBands(
            attrs = {
                align(Alignment2D.CenterStart(start = 25.px))
            },
            colors = listOf(WendyCSS.wendyGreen, WendyCSS.wendyBlue),
        )
        Text(
            text = nickname,
            textStyle = TextStyle.CapH3,
            color = WendyCSS.wendyBlue,
            attrs = {
                align(Alignment2D.Center)
            }
        )
    }
}