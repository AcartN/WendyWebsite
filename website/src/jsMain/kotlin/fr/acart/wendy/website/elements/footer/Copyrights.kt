package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.dom.Text

@Composable
fun Copyrights() {
    NavLink(
        href = "/koala",
        textColor = Color.white,
        textStyle = TextStyle.TextDefault2,
        attrs = {
            classes(WendyCSS.hoverUnderline)
        },
    ) {
        Text("© Wendy Henault | Comportementaliste félin - 2025 Tous droits réservés - CGV - Mentions Légales",)
    }
}