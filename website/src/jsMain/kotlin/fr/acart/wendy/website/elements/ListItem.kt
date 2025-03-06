package fr.acart.wendy.website.elements

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Li
import org.w3c.dom.HTMLLIElement

@Composable
fun ListItem(
    attrs: AttrBuilderContext<HTMLLIElement>? = null,
    content: ContentBuilder<HTMLLIElement>? = null,
) {
    Li(
        attrs = attrs,
        content = content,
    )
}