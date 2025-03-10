package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSNumericValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.StyleScope

fun StyleScope.borderRadiusTopStart(radius: CSSNumericValue<out CSSUnit>) {
    property("border-top-left-radius", radius)
}

fun StyleScope.borderRadiusTopEnd(radius: CSSNumericValue<out CSSUnit>) {
    property("border-top-right-radius", radius)
}

fun StyleScope.borderRadiusBottomStart(radius: CSSNumericValue<out CSSUnit>) {
    property("border-bottom-left-radius", radius)
}

fun StyleScope.borderRadiusBottomEnd(radius: CSSNumericValue<out CSSUnit>) {
    property("border-bottom-right-radius", radius)
}

fun StyleScope.borderRadius(radius: CSSNumericValue<out CSSUnit>) {
    property("border-radius", radius)
}

fun StyleScope.borderRadiusTop(radius: CSSNumericValue<out CSSUnit>) {
    borderRadiusTopStart(radius)
    borderRadiusTopEnd(radius)
}

fun StyleScope.borderRadiusBottom(radius: CSSNumericValue<out CSSUnit>) {
    borderRadiusBottomStart(radius)
    borderRadiusBottomEnd(radius)
}

fun StyleScope.borderRadiusStart(radius: CSSNumericValue<out CSSUnit>) {
    borderRadiusTopStart(radius)
    borderRadiusBottomStart(radius)
}

fun StyleScope.borderRadiusEnd(radius: CSSNumericValue<out CSSUnit>) {
    borderRadiusTopEnd(radius)
    borderRadiusBottomEnd(radius)
}
