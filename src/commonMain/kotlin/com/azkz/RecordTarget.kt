package com.azkz

import kotlinx.serialization.Serializable

@Serializable
data class RecordTarget(

    /**
     * ID
     */
    val id: String,

    /**
     * 有効フラグ
     */
    val enabled: Boolean,

    /**
     * 番組名
     */
    val name: String,

    /**
     * 放送局ID<br>
     * [http://radiko.jp/v3/station/region/full.xml](http://radiko.jp/v3/station/region/full.xml)に書いてあります。
     */
    val stationId: String,

    /**
     * 曜日
     */
    val dayOfWeek: String,

    /**
     * 開始時間
     */
    val startHHmm: String,

    /**
     * 終了時間
     */
    val endHHmm: String,

    ) {

}