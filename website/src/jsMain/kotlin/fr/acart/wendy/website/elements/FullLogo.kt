package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment2D
import fr.acart.wendy.website.elements.layout.Box
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Img
import org.w3c.dom.HTMLDivElement

@Composable
fun FullLogo(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
) {
    Box(
        attrs = {
            attrs?.invoke(this)
            style {
                height(175.px)
                width(183.px)
            }
        },
    ) {
        Img(
            src = "/full_logo_cat.svg",
            alt = "Full Logo cat",
            attrs = {
                style {
                    align(Alignment2D.Center)
                    height(100.percent)
                }
            },
        )
        Img(
            src = "/logo.svg",
            alt = "Logo cat",
            attrs = {
                style {
                    align(Alignment2D.Center)
                    height(76.px)
                }
            },
        )
    }
}