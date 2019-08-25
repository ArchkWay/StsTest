package com.example.teststs.data

import java.util.*

class Move : Item {
    constructor(fromPlace: String?, toPlace: String?) {
        this.fromPlace = fromPlace
        this.toPlace = toPlace
    }

    override fun collectDataForDetails(): String {
        return "Move from: $fromPlace"
    }

    override fun collectDataForName(): String {
        return "Move from: $fromPlace; To: $toPlace"
    }

    var fromPlace: String? = null

    var toPlace: String? = null

    var estimateTime: TimeInterval? = null

}

class TimeInterval {
    val time : Date? = null

}
