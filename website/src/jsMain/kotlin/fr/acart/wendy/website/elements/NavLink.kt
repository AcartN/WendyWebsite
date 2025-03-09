package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.Navigation.navigateTo
import fr.acart.wendy.website.elements.text.TextStyle
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.w3c.dom.HTMLAnchorElement

@Composable
fun NavLink(
    href: String? = null,
    textStyle: TextStyle? = null,
    textColor: CSSColorValue? = null,
    attrs: AttrBuilderContext<HTMLAnchorElement>? = null,
    content: ContentBuilder<HTMLAnchorElement>? = null,
) {
    A(
        href = href,
        attrs = {
            attrs?.invoke(this)
            style {
                textColor?.let {
                    color(it)
                }
                textStyle?.run {
                    applyStyle()
                }
            }
            onClick {
                if (href != null) {
                    navigateTo(href)
                }
            }
            attr("onClick", "return false;")
        },
        content = content,
    )
}