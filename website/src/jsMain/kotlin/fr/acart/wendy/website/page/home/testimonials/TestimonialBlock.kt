package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width

@Composable
fun TestimonialBlock() {
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
        Testimonials()
        DiscoverTestimonials()
    }
}