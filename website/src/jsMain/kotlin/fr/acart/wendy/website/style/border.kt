package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.StyleScope

fun StyleScope.borderBottom(
    width: CSSNumeric? = null,
    style: LineStyle? = null,
    color: CSSColorValue? = null,
) {
    property("border-bottom", "$width $style $color")
}

fun StyleScope.borderTop(
    width: CSSNumeric? = null,
    style: LineStyle? = null,
    color: CSSColorValue? = null,
) {
    property("border-top", "$width $style $color")
}

fun StyleScope.borderStart(
    width: CSSNumeric? = null,
    style: LineStyle? = null,
    color: CSSColorValue? = null,
) {
    property("border-left", "$width $style $color")
}

fun StyleScope.borderEnd(
    width: CSSNumeric? = null,
    style: LineStyle? = null,
    color: CSSColorValue? = null,
) {
    property("border-right", "$width $style $color")
}
