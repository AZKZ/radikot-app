package com.azkz

import io.kvision.data.dataContainer
import io.kvision.form.check.CheckBoxStyle
import io.kvision.form.check.checkBox
import io.kvision.panel.SimplePanel
import io.kvision.state.observableSetOf
import io.kvision.table.*


// 参考:https://github.com/rjaros/kvision-examples/blob/master/addressbook-fullstack-ktor/src/frontendMain/kotlin/com/example/ListPanel.kt
object RecordTargetListPanel : SimplePanel() {
    init {
        val table = Table(types = setOf(TableType.STRIPED, TableType.HOVER)) {
            addHeaderCell(HeaderCell("録音対象"))
            addHeaderCell(HeaderCell("番組名"))
            addHeaderCell(HeaderCell("放送局"))
            addHeaderCell(HeaderCell("開始時間"))
            addHeaderCell(HeaderCell("終了時間"))
        }

        dataContainer(
            model = Model.recordTargets, { recordTargets, index, _ ->
                Row {
                    cell {
                        checkBox(recordTargets.enabled) { style = CheckBoxStyle.INFO}
                    }
                    cell(recordTargets.name)
                    cell(recordTargets.stationId)
                    cell(recordTargets.startHHmm)
                    cell(recordTargets.endHHmm)
                }
            }
        , container = table
        )
    }


}