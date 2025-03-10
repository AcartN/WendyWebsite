package fr.acart.wendy.website.page.home.banner

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.FullLogo
import fr.acart.wendy.website.elements.layout.*
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img

@Composable
fun Banner() {
    Box(
        attrs = {
            style {
                height(600.px)
                width(100.percent)
                background("linear-gradient(90deg, rgba(241,255,255,1) 0%, rgba(227,245,255,1) 66%, rgba(226,244,255,1) 100%)")
            }
        },
    ) {
        Box(
            attrs = {
                style {
                    align(Alignment2D.Center)
                    height(100.percent)
                    maxWidth(1440.px)
                }
            },
        ) {
            Img(
                src = Images.homePageCatNoBackground,
                alt = Strings.altCuteCat,
                attrs = {
                    style {
                        align(Alignment2D.BottomCenter)
                        height(600.px)
                        width(100.percent)
                        property("object-fit", "cover")
                    }
                },
            )
            Row(
                attrs = {
                    style {
                        align(Alignment2D.CenterStart(start = 116.px))
                    }
                },
                horizontalArrangement = Arrangement.spacedBy(32.px),
                verticalItemsAlignment = Alignment.CenterVertically,
            ) {
                FullLogo(
                    attrs = {
                        style {
                            align(Alignment2D.BottomCenter)
                        }
                    },
                )
                HookText()
            }
        }
    }
}