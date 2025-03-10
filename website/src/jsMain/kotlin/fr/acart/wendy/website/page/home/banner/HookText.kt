package fr.acart.wendy.website.page.home.banner

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.text.TextStyle
import fr.acart.wendy.website.resource.Strings
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun HookText() {
    Div(
        attrs = {
            style {
                color(WendyCSS.wendyBlue)
                with(TextStyle.CapH1) {
                    applyStyle()
                }
            }
        },
    ) {
        Text(Strings.hook1)
        Br()
        Text(Strings.hook2)
        Br()
        Text(Strings.hook3)
    }
}