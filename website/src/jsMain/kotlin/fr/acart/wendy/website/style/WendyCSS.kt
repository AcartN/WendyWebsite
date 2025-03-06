package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.*

object WendyCSS : StyleSheet() {
    val lila = Color("#f8d7f9")
    val wendyBlue = Color("#0b033b")
    val wendyGreen = Color("#7eb8b5")
    val pinkBg = Color("#ffedff")
    val hoverZoom by style {
        cursor("pointer")
        property("transition", "transform 0.2s ease-in-out")
        self + hover style {
            scale(1.1)
        }
    }
    val hoverUnderline by style {
        textDecoration("none")
        self + hover style {
            textDecoration("underline")
        }
    }
    val navLink by style {
        textDecoration("none")
        color(wendyBlue)
    }
}