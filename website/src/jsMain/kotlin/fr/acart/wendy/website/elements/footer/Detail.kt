package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Column
import org.jetbrains.compose.web.css.minWidth
import org.jetbrains.compose.web.css.px

@Composable
fun FooterDetails(
    title: String,
    details: List<Detail>,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.px, alignment = Alignment.CenterVertically),
        horizontalItemAlignment = Alignment.Start,
        attrs = {
            style {
                minWidth(325.px)
            }
        }
    ) {
        FooterTitle(title)
        for (footerDetail in details) {
            FooterInfo(
                imgSrc = footerDetail.imgSrc,
                alt = footerDetail.alt,
                text = footerDetail.text,
            )
        }
    }
}

data class Detail(
    val imgSrc: String,
    val alt: String,
    val text: String,
)
