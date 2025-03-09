package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

@Composable
fun FooterContent() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(64.px),
        verticalItemsAlignment = Alignment.Top,
    ) {
        FooterDetails(
            title = "Me Contacter :",
            details = listOf(
                Detail("/contact_me_white.svg", "Contact Me", "wendycomportementaliste86@gmail.com"),
                Detail("/phone_white.svg", "Phone", "06.98.78.18.03")
            ),
        )
        Img(
            src = "/full_logo_pink.svg",
            alt = "Logo",
            attrs = {
                style {
                    width(155.px)
                    height(148.px)
                }
            },
        )
        FooterDetails(
            title = "Me Suivre :",
            details = listOf(
                Detail("/instagram_white.svg", "Instagram", "@wendy_comportementaliste86"),
            ),
        )
    }
}