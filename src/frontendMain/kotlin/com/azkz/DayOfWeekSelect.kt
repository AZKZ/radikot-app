package com.azkz

import io.kvision.form.select.Select

fun dayOfWeekSelect(): Select {
    return Select(
        options = listOf(
            "月" to "MONDAY",
            "火" to "TUESDAY",
            "水" to "WEDNESDAY",
            "木" to "THURSDAY",
            "金" to "FRIDAY",
            "土" to "SATURDAY",
            "日" to "SUNDAY",
        )
    )
}