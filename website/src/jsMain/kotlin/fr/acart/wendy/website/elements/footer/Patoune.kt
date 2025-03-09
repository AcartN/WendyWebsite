package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Img
import org.w3c.dom.HTMLImageElement

@Composable
fun Patoune(
    attrs : AttrBuilderContext<HTMLImageElement>?,
) {
    Img(
        src = "/patoune.svg",
        alt = "Patoune",
        attrs = {
            attrs?.invoke(this)
        },
    )
}