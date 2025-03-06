package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Ul
import org.w3c.dom.HTMLUListElement

@Composable
fun UnorderedList(
    attrs: AttrBuilderContext<HTMLUListElement>? = null,
    content: ContentBuilder<HTMLUListElement>? = null,
) {
    Ul(
        attrs = attrs,
        content = content,
    )
}
