package fr.acart.wendy.website.elements.text

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun Text(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    text: String,
    color: CSSColorValue,
    textStyle: TextStyle,
) {
    Div(
        attrs = {
            attrs?.invoke(this)
            style {
                color(color)
                with(textStyle) {
                    applyStyle()
                }
            }
        },
    ) {
        org.jetbrains.compose.web.dom.Text(text)
    }
}

sealed interface TextStyle {
    fun StyleScope.applyStyle()

    data object CapH1 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Lemon Milk", "sans-serif")
            fontWeight("bold")
            fontSize(34.px)
            property("text-transform", "uppercase")
        }
    }
    data object CapH2 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Lemon Milk", "sans-serif")
            fontWeight("bold")
            fontSize(25.px)
            property("text-transform", "uppercase")
        }
    }
    data object CapH3 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Lemon Milk", "sans-serif")
            fontWeight("bold")
            fontSize(18.px)
            property("text-transform", "uppercase")
        }
    }

    data object Action1 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Baloo", "sans-serif")
            fontWeight("regular")
            fontSize(20.px)
            property("text-transform", "uppercase")
        }
    }
    data object Action2 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Lemon Milk", "sans-serif")
            fontWeight("bold")
            fontSize(18.px)
            property("text-transform", "uppercase")
        }
    }

    data object TextDefault1 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Baloo", "sans-serif")
            fontWeight("regular")
            fontSize(22.px)
        }
    }
    data object TextDefault2 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Baloo", "sans-serif")
            fontWeight("regular")
            fontSize(20.px)
        }
    }
    data object TextDefault3 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Baloo", "sans-serif")
            fontWeight("regular")
            fontSize(18.px)
        }
    }
    data object TextDefault4 : TextStyle {
        override fun StyleScope.applyStyle() {
            fontFamily("Baloo", "sans-serif")
            fontWeight("regular")
            fontSize(14.px)
        }
    }
}
