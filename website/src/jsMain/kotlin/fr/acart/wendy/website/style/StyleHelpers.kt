package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword

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

fun StyleScope.blur(radius: CSSNumeric) {
    property("backdrop-filter", "blur($radius)")
}

fun StyleScope.zIndex(value: Int) {
    property("z-index", "$value")
}

fun StyleScope.scale(value: Double) {
    property("transform", "scale($value)")
}

fun StyleScope.scaleX(value: Double) {
    property("transform", "scaleX($value)")
}

fun StyleScope.scaleY(value: Double) {
    property("transform", "scaleY($value)")
}

fun StyleScope.scaleXY(x: Double, y: Double) {
    property("transform", "scale($x, $y)")
}

fun StyleScope.margin(vertical: CSSNumeric, horizontal: CSSAutoKeyword) {
    property("margin", "$vertical $horizontal")
}

fun StyleScope.margin(vertical: CSSAutoKeyword, horizontal: CSSNumeric) {
    property("margin", "$vertical $horizontal")
}

fun StyleScope.marginHorizontal(horizontal: CSSNumeric) {
    property("margin-left", "$horizontal")
    property("margin-right", "$horizontal")
}

fun StyleScope.marginHorizontal(horizontal: CSSAutoKeyword) {
    property("margin-left", "$horizontal")
    property("margin-right", "$horizontal")
}

fun StyleScope.marginVertical(vertical: CSSNumeric) {
    property("margin-top", "$vertical")
    property("margin-bottom", "$vertical")
}

fun StyleScope.marginVertical(vertical: CSSAutoKeyword) {
    property("margin-top", "$vertical")
    property("margin-bottom", "$vertical")
}

fun StyleScope.margin(all: CSSAutoKeyword) {
    property("margin", "$all")
}

fun StyleScope.marginStart(value: CSSAutoKeyword) {
    property("margin-left", "$value")
}

fun StyleScope.marginEnd(value: CSSAutoKeyword) {
    property("margin-right", "$value")
}

fun StyleScope.marginTop(value: CSSAutoKeyword) {
    property("margin-top", "$value")
}

fun StyleScope.marginBottom(value: CSSAutoKeyword) {
    property("margin-bottom", "$value")
}
