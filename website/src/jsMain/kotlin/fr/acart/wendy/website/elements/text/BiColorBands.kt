package fr.acart.wendy.website.elements.text

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.footer.Rectangle
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.w3c.dom.HTMLDivElement

@Composable
fun BiColorBands(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    colors: List<CSSColorValue>,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.px),
        attrs = {
            attrs?.invoke(this)
            style {
                height(100.percent)
            }
        },
    ) {
        for (color in colors) {
            Rectangle(
                color = color,
                height = 100.percent,
                width = 20.px,
            )
        }
    }
}