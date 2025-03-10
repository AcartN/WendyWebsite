package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.Color

@Composable
fun Copyrights() {
    NavLink(
        href = "/koala",
        text = Strings.copyrights,
        textColor = Color.white,
        textStyle = TextStyle.TextDefault2,
        attrs = {
            classes(WendyCSS.hoverUnderline)
        },
    )
}