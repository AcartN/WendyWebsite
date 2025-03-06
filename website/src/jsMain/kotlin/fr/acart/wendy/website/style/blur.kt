package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.StyleScope


fun StyleScope.blur(radius: CSSNumeric) {
    property("backdrop-filter", "blur($radius)")
}
