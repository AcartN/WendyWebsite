package fr.acart.wendy.website

import androidx.compose.runtime.*
import fr.acart.wendy.website.Navigation.navigateBack
import fr.acart.wendy.website.Navigation.navigateTo
import fr.acart.wendy.website.page.home.Home
import fr.acart.wendy.website.style.WendyCSS
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposableInBody
import org.w3c.dom.events.Event

fun main() {
    renderComposableInBody {
        Style(WendyCSS)
        Home()
    }
}


fun test() {
    renderComposableInBody {
        var currentPath by remember { mutableStateOf(window.location.pathname) }
        var count by remember { mutableStateOf(0) }
        Div {
            Img(
                src = "/hp_cat_no_bg_1.webp",
                alt = "Cute Cat",
                attrs = {
                    style {
                        backgroundColor(Color.cyan)
                    }
                },
            )
        }
        Div {
            Text("Hello, World!")
        }
        Button(attrs = { onClick { count++ } }) {
            Text("I've been clicked $count times")
        }
        Button(attrs = { onClick { window.location.pathname = "/next" } }) {
            Text("Go to the next page")
        }
        Button(attrs = {
            onClick {
                navigateTo("/next")
            }
        }) {
            Text("Go to the next page with history")
        }
        if (currentPath == "/next") {
            Div {
                Text("You are on the next page!")
            }
            Button(attrs = { onClick { navigateBack() } }) {
                Text("Go back")
            }
        }
        LaunchedEffect("pathListener") {
            console.log("Listening to path changes")
            window.addEventListener("popstate", {
                window.dispatchEvent(Event("locationchange"))
            })
            window.addEventListener("locationchange", {
                currentPath = window.location.pathname
                console.log("Path changed to $currentPath")
            })
        }
    }
}

object Navigation {
    fun navigateTo(path: String) {
        window.history.pushState(data = null, title = path, url = path)
        window.dispatchEvent(Event("locationchange"))
    }
    fun navigateReplace(path: String) {
        window.history.replaceState(data = null, title = path, url = path)
        window.dispatchEvent(Event("locationchange"))
    }
    fun navigateBack() {
        window.history.back()
    }
    fun navigateForward() {
        window.history.forward()
    }
    fun refresh() {
        window.location.reload()
    }
    fun getCurrentPathName(): String {
        return window.location.pathname
    }
}

