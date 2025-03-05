package fr.acart.wendy.website.elements.layout

import fr.acart.wendy.website.style.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

sealed interface Alignment2D {
    fun StyleScope.place()

    open class TopStart(
        val top: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
        val start: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {
        override fun StyleScope.place() {
            marginTop(top)
            marginLeft(start)
            marginEnd(auto)
            marginBottom(auto)
        }

        companion object : TopStart()
    }
    open class TopCenter(
        val top: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginTop(top)
            marginStart(auto)
            marginEnd(auto)
            marginBottom(auto)
        }

        companion object : TopCenter()
    }
    open class TopEnd(
        val top: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
        val end: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginTop(top)
            marginRight(end)
            marginStart(auto)
            marginBottom(auto)
        }

        companion object : TopEnd()
    }
    open class CenterStart(
        val start: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginLeft(start)
            marginEnd(auto)
            marginTop(auto)
            marginBottom(auto)
        }

        companion object : CenterStart()
    }
    open class Center : Alignment2D {

        override fun StyleScope.place() {
            margin(auto)
        }

        companion object : Center()
    }

    open class CenterEnd(
        val end: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginRight(end)
            marginStart(auto)
            marginTop(auto)
            marginBottom(auto)
        }

        companion object : CenterEnd()
    }
    open class BottomStart(
        val bottom: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
        val start: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginBottom(bottom)
            marginLeft(start)
            marginTop(auto)
            marginEnd(auto)
        }

        companion object : BottomStart()
    }
    open class BottomCenter(
        val bottom: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginBottom(bottom)
            marginStart(auto)
            marginEnd(auto)
            marginTop(auto)
        }

        companion object : BottomCenter()
    }
    open class BottomEnd(
        val bottom: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
        val end: CSSSizeValue<out CSSUnitLengthOrPercentage> = 0.px,
    ) : Alignment2D {

        override fun StyleScope.place() {
            marginBottom(bottom)
            marginRight(end)
            marginTop(auto)
            marginStart(auto)
        }

        companion object : BottomEnd()
    }
}
