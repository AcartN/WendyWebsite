package fr.acart.wendy.website.page

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.footer.Footer
import fr.acart.wendy.website.elements.footer.footerHeight
import fr.acart.wendy.website.elements.header.Header
import fr.acart.wendy.website.elements.header.headerHeight
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Column
import fr.acart.wendy.website.elements.layout.Spacer
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Main
import org.w3c.dom.HTMLElement

@Composable
fun BasicPage(
    attrs: AttrBuilderContext<HTMLElement>?,
    content: @Composable () -> Unit
) {
    Header()
    Column(
        attrs = {
            style {
                width(100.percent)
                minHeight(100.vh)
            }
        },
        horizontalItemAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(
            width = 100.percent,
            height = headerHeight,
        )
        Main(
            attrs = {
                attrs?.invoke(this)
                style {
                    margin(0.px)
                    width(100.percent)
                    minHeight(100.vh - headerHeight - footerHeight)
                }
            }
        ) {
            content()
        }
        Footer()
    }
}
