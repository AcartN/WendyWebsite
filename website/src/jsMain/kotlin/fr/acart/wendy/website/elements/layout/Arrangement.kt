package fr.acart.wendy.website.elements.layout

import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.px

sealed interface Arrangement {
    val value: JustifyContent
    val spacedBy: CSSNumeric
    val flowGap: CSSNumeric

    sealed interface Vertical : Arrangement
    sealed interface Horizontal : Arrangement
    sealed interface HorizontalOrVertical : Horizontal, Vertical

    data object Start : Horizontal {
        override val value: JustifyContent = JustifyContent.FlexStart
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px

    }
    data object End : Horizontal {
        override val value: JustifyContent = JustifyContent.FlexEnd
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object Center : HorizontalOrVertical {
        override val value: JustifyContent = JustifyContent.Center
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object Top : Vertical {
        override val value: JustifyContent = JustifyContent.FlexStart
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object Bottom : Vertical {
        override val value: JustifyContent = JustifyContent.FlexEnd
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object SpaceBetween : HorizontalOrVertical {
        override val value: JustifyContent = JustifyContent.SpaceBetween
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object SpaceAround : HorizontalOrVertical {
        override val value: JustifyContent = JustifyContent.SpaceAround
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    data object SpaceEvenly : HorizontalOrVertical {
        override val value: JustifyContent = JustifyContent.SpaceEvenly
        override val spacedBy: CSSNumeric = 0.px
        override val flowGap: CSSNumeric = 0.px
    }
    private data class SpacedBy(
        override val value: JustifyContent,
        override val spacedBy: CSSNumeric,
        override val flowGap: CSSNumeric,
    ) : HorizontalOrVertical
    companion object {
        fun spacedBy(value: CSSNumeric): HorizontalOrVertical = SpacedBy(JustifyContent.FlexStart, value, 0.px)
        fun spacedBy(value: CSSNumeric, flowGap: CSSNumeric = 0.px, alignment: Alignment.Horizontal): Horizontal {
            return when (alignment) {
                is Alignment.Start -> SpacedBy(JustifyContent.FlexStart, value, flowGap)
                is Alignment.End -> SpacedBy(JustifyContent.FlexEnd, value, flowGap)
                is Alignment.CenterHorizontally -> SpacedBy(JustifyContent.Center, value, flowGap)
            }
        }
        fun spacedBy(value: CSSNumeric, flowGap: CSSNumeric = 0.px, alignment: Alignment.Vertical): Vertical {
            return when (alignment) {
                is Alignment.Top -> SpacedBy(JustifyContent.FlexStart, value, flowGap)
                is Alignment.Bottom -> SpacedBy(JustifyContent.FlexEnd, value, flowGap)
                is Alignment.CenterVertically -> SpacedBy(JustifyContent.Center, value, flowGap)
            }
        }
    }
}
