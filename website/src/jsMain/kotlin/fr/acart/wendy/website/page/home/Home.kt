package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.TitleDivider
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import fr.acart.wendy.website.page.BasicPage
import fr.acart.wendy.website.page.home.banner.Banner
import fr.acart.wendy.website.page.home.presentation.PresentationBlock
import fr.acart.wendy.website.page.home.testimonials.TestimonialBlock
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.paddingVertical
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width

@Composable
fun Home() {
    BasicPage(
        attrs = {
            style {
                backgroundColor(WendyCSS.pinkBg)
            }
        }
    ) {
        Banner()
        TitleDivider()
        Column(
            attrs = {
                style {
                    paddingVertical(94.px)
                    width(100.percent)
                }
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(94.px, alignment = Alignment.CenterVertically),
        ) {
            PresentationBlock()
            TestimonialBlock()
        }
    }
}
