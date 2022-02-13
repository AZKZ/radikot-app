package com.azkz

actual class RecordTargetService:IRecordTargetService {
    override suspend fun getAll(): List<RecordTarget> {
        return dummy
    }

    override suspend fun register(entity: RecordTarget): RecordTarget {
        TODO("Not yet implemented")
        print("a")
    }

    override suspend fun delete(ids: List<String>): Int {
        TODO("Not yet implemented")
        print("b")
    }

    override suspend fun update(id: String): RecordTarget {
        TODO("Not yet implemented")
        print("c")
    }

    override suspend fun toggleRecordFlag(id: String): Boolean {
        TODO("Not yet implemented")
        print("d")
    }
}

    val dummy = listOf(
        RecordTarget(id="111",true,"アルコ＆ピース D.C.GARAGE","TBS", dayOfWeek = "火","2400","2500"),
        RecordTarget(id="222",false,"沈黙の金曜日","FM-FUJI", dayOfWeek = "金","2100","2300"),
        RecordTarget(id="333",true,"オードリーのオールナイトニッポン","LFR", dayOfWeek = "土","2400","2600"),
    )