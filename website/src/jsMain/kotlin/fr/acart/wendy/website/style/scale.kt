package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.StyleScope

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
