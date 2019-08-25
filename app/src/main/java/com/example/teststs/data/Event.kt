package com.example.teststs.data

import java.util.*

class Event: Item {
    constructor(startTime: Date?, endTime: Date?, name: String?) {
        this.startTime = startTime
        this.endTime = endTime
        this.name = name
    }

    override fun collectDataForName(): String {
        return "Event name: $name"
    }

    override fun collectDataForDetails(): String {
        return "Event name: $name; start: $startTime; end: $endTime"
    }

    var startTime: Date? = null

    var endTime: Date? = null

    var name: String? = null

}