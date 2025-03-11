package fr.acart.wendy.website.page.notfound

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment2D
import fr.acart.wendy.website.elements.layout.Box
import fr.acart.wendy.website.style.WendyCSS
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Iframe
import org.jetbrains.compose.web.dom.Text

@Composable
fun NotFound() {
    Box(
        attrs = {
            style {
                backgroundColor(WendyCSS.pinkBg)
                width(100.percent)
                height(100.vh)
            }
        }
    ) {
        Div(
            attrs = {
                align(Alignment2D.TopCenter(top = 20.px))
            }
        ) {
            Text("404 Not Found")
        }
        Div(
            attrs = {
                align(Alignment2D.Center)
            }
        ) {
            Iframe(
                attrs = {
                    style {
                        width(75.vw)
                        height(75.vh)
                    }
                    attr("src", "https://www.youtube.com/embed/dQw4w9WgXcQ?autoplay=1")
                    attr("allow", "autoplay")
                }
            )
        }
    }
}