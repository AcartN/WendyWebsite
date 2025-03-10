package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.borderRadiusBottom
import fr.acart.wendy.website.style.borderRadiusTop
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

@Composable
fun TestimonialImage(imgSrc: String) {
    Img(
        src = imgSrc,
        alt = Strings.altCuteCat,
        attrs = {
            style {
                width(366.px)
                height(360.px)
                borderRadiusTop(100.percent)
                borderRadiusBottom(20.px)
            }
        },
    )
}