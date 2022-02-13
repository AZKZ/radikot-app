package com.azkz

import io.kvision.*
import io.kvision.html.Button
import io.kvision.html.ButtonStyle
import io.kvision.html.H1
import io.kvision.html.button
import io.kvision.i18n.DefaultI18nManager
import io.kvision.i18n.I18n
import io.kvision.panel.root
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.launch

val AppScope = CoroutineScope(window.asCoroutineDispatcher())

class App : Application() {

    override fun start(state: Map<String, Any>) {
        I18n.manager =
            DefaultI18nManager(
                mapOf(
                    "en" to io.kvision.require("i18n/messages-en.json"),
                    "pl" to io.kvision.require("i18n/messages-pl.json")
                )
            )
        val root = root("kvapp") {
        }
        AppScope.launch {
            root.add(H1("Radikot"))
            root.add(Button("追加",style=ButtonStyle.INFO).onClick {
                window.alert("追加ですよー")
            })
            root.add(RecordTargetListPanel)
            Model.getRecordTargetListAll()
        }
    }
}

fun main() {
    startApplication(::App, module.hot, BootstrapModule, BootstrapCssModule, CoreModule)
}
