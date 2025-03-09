package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun AllLinks() {
    Column(
        attrs = {
            style {
                width(604.px)
            }
        },
        horizontalItemAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(64.px, alignment = Alignment.CenterVertically),
    ) {
        val links = listOf(
            Strings.navWhoAmI,
            Strings.navWhenToConsult,
            Strings.navServices,
            Strings.navTestimonials,
            Strings.navContactMe,
        )

        for ((index, link) in links.withIndex()) {
            Row(
                attrs = {
                    style {
                        if (index == links.lastIndex)
                            backgroundColor(WendyCSS.wendyBlue)
                        else
                            backgroundColor(WendyCSS.lila)
                        paddingLeft(32.px)
                        width(100.percent)
                        height(64.px)
                        borderRadius(10.px)
                    }
                },
                horizontalArrangement = Arrangement.spacedBy(32.px),
                verticalItemsAlignment = Alignment.CenterVertically,
            ) {
                Img(
                    attrs = {
                        style {
                            width(36.px)
                            height(36.px)
                        }
                    },
                    src = when {
                        index == links.lastIndex -> Images.patounette2White
                        index % 2 == 0 -> Images.patounette
                        else -> Images.patounette2
                    },
                    alt = Strings.altPaw,
                )
                NavLink(
                    href = "/",
                    textStyle = TextStyle.Action2,
                    textColor = if (index == links.lastIndex)
                        Color.white
                    else
                        WendyCSS.wendyBlue,
                    attrs = {
                        classes(WendyCSS.hoverUnderline)
                    }
                ) {
                    Text(link)
                }
            }
        }
    }
}