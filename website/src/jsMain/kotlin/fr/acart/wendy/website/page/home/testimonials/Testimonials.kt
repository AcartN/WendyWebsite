package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width

@Composable
fun Testimonials() {
    Row(
        attrs = {
            style {
                width(100.percent)
            }
        },
        horizontalArrangement = Arrangement.spacedBy(60.px, alignment = Alignment.CenterHorizontally),
        verticalItemsAlignment = Alignment.CenterVertically,
    ) {
        val testimonials = listOf(
            Pair("/loupa.png", "Loupa"),
            Pair("/pops.png", "Pops"),
            Pair("/snickers.png", "Snickers"),
        )
        for ((index, testimonial) in testimonials.withIndex()) {
            Testimonial(
                imgSrc = testimonial.first,
                nickname = testimonial.second,
                hasLurkingCat = index % 2 == 1,
            )
        }
    }
}