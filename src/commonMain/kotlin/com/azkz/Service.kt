package com.azkz

import io.kvision.annotations.KVService

@KVService
interface IRecordTargetService {
    suspend fun getAll(): List<RecordTarget>
    suspend fun register(entity: RecordTarget): RecordTarget
    suspend fun delete(ids: List<String>): Int
    suspend fun update(id: String):RecordTarget
    suspend fun toggleRecordFlag(id: String): Boolean
}