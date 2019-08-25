package com.example.teststs.data

import com.example.teststs.data.Item
import java.util.*

data class Notice(val flightDate: Date, val gate: String) : Item {
    override fun collectDataForDetails(): String {
        return "From: " + gate + "When: "+ flightDate

    }

    override fun collectDataForName(): String {
            return "Notice: $gate"
    }



}