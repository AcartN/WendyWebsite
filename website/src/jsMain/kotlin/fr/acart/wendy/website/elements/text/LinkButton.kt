package fr.acart.wendy.website.elements.text

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.NavLink
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.w3c.dom.HTMLAnchorElement

@Composable
fun LinkButton(
    text: String,
    href: String,
    attrs: AttrBuilderContext<HTMLAnchorElement>? = null,
) {
    NavLink(
        href = href,
        textStyle = TextStyle.Action2,
        textColor = Color.white,
        text = text,
        attrs = {
            attrs?.invoke(this)
            classes(WendyCSS.buttonStyle)
        },
    )
}