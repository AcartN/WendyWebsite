package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.StyleScope

fun StyleScope.zIndex(value: Int) {
    property("z-index", "$value")
}