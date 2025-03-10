package fr.acart.wendy.website.page.home.presentation

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.px

@Composable
fun PresentationBlock() {
    Row(
        attrs = {
            style {
                maxWidth(1440.px)
            }
        },
        horizontalArrangement = Arrangement.spacedBy(98.px, alignment = Alignment.CenterHorizontally),
        verticalItemsAlignment = Alignment.CenterVertically,
        wrap = true,
    ) {
        Profile()
        AllLinks()
    }
}