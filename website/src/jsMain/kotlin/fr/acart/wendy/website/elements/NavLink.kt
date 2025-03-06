package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.Navigation.navigateTo
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.w3c.dom.HTMLAnchorElement

@Composable
fun NavLink(
    href: String? = null,
    attrs: AttrBuilderContext<HTMLAnchorElement>? = null,
    content: ContentBuilder<HTMLAnchorElement>? = null,
) {
    A(
        href = href,
        attrs = {
            attrs?.invoke(this)
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