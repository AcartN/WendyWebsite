package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Img
import org.w3c.dom.HTMLImageElement

@Composable
fun Patoune(
    attrs : AttrBuilderContext<HTMLImageElement>?,
) {
    Img(
        src = Images.patoune,
        alt = Strings.altPatoune,
        attrs = {
            attrs?.invoke(this)
        },
    )
}