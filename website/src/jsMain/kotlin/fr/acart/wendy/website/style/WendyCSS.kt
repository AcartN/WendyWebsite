package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.*

object WendyCSS : StyleSheet() {
    val lila = Color("#f8d7f9")
    val wendyBlue = Color("#0b033b")
    val wendyGreen = Color("#7eb8b5")
    val pinkBg = Color("#ffedff")
    val hoverMegaZoom by style {
        cursor("pointer")
        property("transition", "transform 0.2s ease-in-out")
        self + hover style {
            scale(1.2)
        }
    }
    val buttonStyle by style {
        backgroundColor(wendyBlue)
        textDecoration("none")
        borderRadius(20.px)
        alignContent(AlignContent.Center)
        textAlign("center")
        paddingVertical(12.px)
        paddingHorizontal(24.px)
        property("filter", "drop-shadow(4px 8px 4px rgba(0, 0, 0, 0.25))")
        property("transition", "background-color 100ms linear")
        self + hover style {
            // 5% lighten wendy blue
            backgroundColor(Color("#0f0450"))
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