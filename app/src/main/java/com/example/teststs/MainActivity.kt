package com.example.teststs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.teststs.data.Event
import com.example.teststs.data.Item
import com.example.teststs.data.Move
import com.example.teststs.data.Notice
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), ItemsAdapter.AdapterInteractionInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvList: RecyclerView = findViewById(R.id.rvMain)
        rvList.layoutManager = LinearLayoutManager(this)
        val adapter = ItemsAdapter(generateRandomData(), this)
        rvList.adapter = adapter
    }

    override fun clickListener(details: Item) {
        startActivity(DetailsActivity.makeIntent(this, details.collectDataForDetails()))
    }

    private fun generateRandomData(): ArrayList<Item> {
        val min = 10
        val max = 100
        val temporalList: ArrayList<Item> = ArrayList()
        val random = (Math.random() * (max - min + 1) + min).toInt()
        temporalList.add(Event(Date(11111111991), Date(222222222522), "working on STS"))
        temporalList.add(Move(getString(R.string.spb), getString(R.string.moskow)))
        temporalList.add(Notice(Date(555), "Frankfurt"))
        for (i in 0 until random) {
            temporalList.add(i, object : Item {
                override fun collectDataForName(): String {
                    return "Item №: $i"
                }

                override fun collectDataForDetails(): String {
                    return "Details №: $i"
                }
            })
        }
        return temporalList
    }
}
