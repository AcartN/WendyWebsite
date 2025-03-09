package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

@Composable
fun FooterInfo(
    imgSrc: String,
    alt: String,
    text: String,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(15.px),
        verticalItemsAlignment = Alignment.CenterVertically,
    ) {
        Img(
            src = imgSrc,
            alt = alt,
            attrs = {
                style {
                    width(37.px)
                }
            },
        )
        Text(
            text = text,
            color = Color.white,
            textStyle = TextStyle.TextDefault4,
        )
    }
}