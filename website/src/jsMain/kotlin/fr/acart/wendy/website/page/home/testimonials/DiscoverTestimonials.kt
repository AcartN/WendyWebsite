package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.text.LinkButton
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.marginHorizontal
import org.jetbrains.compose.web.css.keywords.auto

@Composable
fun DiscoverTestimonials() {
    LinkButton(
        text = Strings.discoverTestimonials,
        href = "/testimonials",
        attrs = {
            style {
                marginHorizontal(auto)
            }
        },
    )
}