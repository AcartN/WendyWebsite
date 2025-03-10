package fr.acart.wendy.website.page.home

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.text.Text
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*

@Composable
fun TitleDivider() {
    Text(
        attrs = {
            style {
                width(100.percent)
                height(70.px)
                backgroundColor(WendyCSS.wendyBlue)
                textAlign("center")
                alignContent(AlignContent.Center)
            }
        },
        text = Strings.titleWendy,
        textStyle = TextStyle.CapH2,
        color = Color.white,
    )
}