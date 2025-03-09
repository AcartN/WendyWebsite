package fr.acart.wendy.website.elements.header

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.ListItem
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.style.WendyCSS
import fr.acart.wendy.website.style.WendyCSS.wendyBlue
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.Text

@Composable
fun NavItem(
    href: String,
    text: String,
) {
    ListItem {
        NavLink(
            href = href,
            attrs = {
                classes(WendyCSS.hoverUnderline)
                style {
                    color(wendyBlue)
                }
            }
        ) {
            Text(text)
        }
    }
}
