package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword

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

fun StyleScope.marginStart(value: CSSNumeric) {
    property("margin-left", "$value")
}

fun StyleScope.marginEnd(value: CSSNumeric) {
    property("margin-right", "$value")
}
