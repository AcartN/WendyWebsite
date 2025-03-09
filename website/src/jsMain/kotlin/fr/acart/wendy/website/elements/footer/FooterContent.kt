package fr.acart.wendy.website.elements.footer

import androidx.compose.runtime.Composable
import fr.acart.wendy.website.elements.layout.Alignment
import fr.acart.wendy.website.elements.layout.Arrangement
import fr.acart.wendy.website.elements.layout.Row
import fr.acart.wendy.website.resource.Images
import fr.acart.wendy.website.resource.Strings
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
            title = Strings.contactMe,
            details = listOf(
                Detail(Images.contactMeWhite, Strings.navContactMe, Strings.wendyEmail),
                Detail(Images.phoneWhite, Strings.altPhone, Strings.wendyPhone)
            ),
        )
        Img(
            src = Images.fullLogoPink,
            alt = Strings.altLogo,
            attrs = {
                style {
                    width(155.px)
                    height(148.px)
                }
            },
        )
        FooterDetails(
            title = Strings.followMe,
            details = listOf(
                Detail(Images.instagramWhite, Strings.altInstagram, Strings.wendyInstagram),
            ),
        )
    }
}