package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.text.Title
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.marginStart
import org.jetbrains.compose.web.css.px

@Composable
fun TestimonialTitle() {
    Title(
        attrs = {
            style {
                marginStart(114.px)
            }
        },
        title = Strings.testimonials,
        contentColor = WendyCSS.wendyBlue,
        backgroundColor = WendyCSS.lila,
    )
}