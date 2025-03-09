package fr.acart.wendy.website.style

import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword

fun StyleScope.padding(vertical: CSSNumeric, horizontal: CSSAutoKeyword) {
    property("padding", "$vertical $horizontal")
}

fun StyleScope.padding(vertical: CSSAutoKeyword, horizontal: CSSNumeric) {
    property("padding", "$vertical $horizontal")
}

fun StyleScope.paddingHorizontal(horizontal: CSSNumeric) {
    property("padding-left", "$horizontal")
    property("padding-right", "$horizontal")
}

fun StyleScope.paddingHorizontal(horizontal: CSSAutoKeyword) {
    property("padding-left", "$horizontal")
    property("padding-right", "$horizontal")
}

fun StyleScope.paddingVertical(vertical: CSSNumeric) {
    property("padding-top", "$vertical")
    property("padding-bottom", "$vertical")
}

fun StyleScope.paddingVertical(vertical: CSSAutoKeyword) {
    property("padding-top", "$vertical")
    property("padding-bottom", "$vertical")
}

fun StyleScope.padding(all: CSSAutoKeyword) {
    property("padding", "$all")
}

fun StyleScope.paddingStart(value: CSSAutoKeyword) {
    property("padding-left", "$value")
}

fun StyleScope.paddingEnd(value: CSSAutoKeyword) {
    property("padding-right", "$value")
}

fun StyleScope.paddingTop(value: CSSAutoKeyword) {
    property("padding-top", "$value")
}

fun StyleScope.paddingBottom(value: CSSAutoKeyword) {
    property("padding-bottom", "$value")
}

fun StyleScope.paddingStart(value: CSSNumeric) {
    property("padding-left", "$value")
}

fun StyleScope.paddingEnd(value: CSSNumeric) {
    property("padding-right", "$value")
}
