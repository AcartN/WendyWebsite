package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.*

fun StyleScope.size(value: CSSNumericValue<out CSSUnit>) {
    height(value)
    width(value)
}