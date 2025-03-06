package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Ol
import org.w3c.dom.HTMLOListElement

@Composable
fun OrderedList(
    attrs: AttrBuilderContext<HTMLOListElement>? = null,
    content: ContentBuilder<HTMLOListElement>? = null,
) {
    Ol(
        attrs = attrs,
        content = content,
    )
}
