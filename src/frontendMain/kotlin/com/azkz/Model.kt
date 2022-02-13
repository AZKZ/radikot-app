package com.azkz

import io.kvision.state.ObservableList
import io.kvision.state.observableListOf
import io.kvision.utils.syncWithList

object Model {

    val recordTargets: ObservableList<RecordTarget> = observableListOf()

    private
    val recordTargetService = RecordTargetService()

    suspend fun getRecordTargetListAll() {
        val newList = recordTargetService.getAll()
        recordTargets.syncWithList(newList)
    }

}
