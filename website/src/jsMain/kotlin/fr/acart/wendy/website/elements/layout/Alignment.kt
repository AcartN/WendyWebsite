package fr.acart.wendy.website.elements.layout

import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.AlignItems

sealed interface Alignment {
    val alignItems: AlignItems
    val alignContent: AlignContent
    sealed interface Vertical : Alignment
    sealed interface Horizontal : Alignment

    data object Top : Vertical {
        override val alignItems: AlignItems = AlignItems.FlexStart
        override val alignContent: AlignContent = AlignContent.FlexStart
    }
    data object Bottom : Vertical {
        override val alignItems: AlignItems = AlignItems.FlexEnd
        override val alignContent: AlignContent = AlignContent.FlexEnd
    }
    data object CenterVertically : Vertical {
        override val alignItems: AlignItems = AlignItems.Center
        override val alignContent: AlignContent = AlignContent.Center
    }

    data object Start : Horizontal {
        override val alignItems: AlignItems = AlignItems.FlexStart
        override val alignContent: AlignContent = AlignContent.FlexStart
    }
    data object End : Horizontal {
        override val alignItems: AlignItems = AlignItems.FlexEnd
        override val alignContent: AlignContent = AlignContent.FlexEnd
    }
    data object CenterHorizontally : Horizontal {
        override val alignItems: AlignItems = AlignItems.Center
        override val alignContent: AlignContent = AlignContent.Center
    }
}
