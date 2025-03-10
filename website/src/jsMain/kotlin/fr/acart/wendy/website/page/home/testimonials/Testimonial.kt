package fr.acart.wendy.website.page.home.testimonials

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

@Composable
fun Testimonial(imgSrc: String, nickname: String, hasLurkingCat: Boolean) {
    Box(
        attrs = {
            style {
                width(366.px)
                height(506.px)
            }
        },
    ) {
        Column(
            attrs = {
                align(Alignment2D.BottomCenter)
            },
            horizontalItemAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.px, alignment = Alignment.CenterVertically),
        ) {
            TestimonialImage(imgSrc)
            TestimonialNickname(nickname)
        }
        Img(
            src = if (hasLurkingCat) Images.catBadge2 else Images.catBadge1,
            alt = Strings.altCuteCat,
            attrs = {
                style {
                    align(Alignment2D.TopStart)
                    marginTop(50.px)
                    width(126.px)
                }
            },
        )
        if (hasLurkingCat) {
            Img(
                src = Images.catLurking,
                alt = Strings.altCatLurking,
                attrs = {
                    style {
                        align(Alignment2D.TopCenter)
                        width(170.px)
                    }
                },
            )
        }
    }
}