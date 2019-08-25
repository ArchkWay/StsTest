package com.example.teststs

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var tvDetails: TextView = findViewById(R.id.tvDetails)
        val intent = intent
        tvDetails.text = intent.getStringExtra(EXTRA_DETAILS)
    }

    companion object {
        private const val EXTRA_DETAILS = "EXTRA_DETAILS"
        fun makeIntent(context: Context, details: String): Intent {
            return Intent(context, DetailsActivity::class.java).putExtra(EXTRA_DETAILS, details)
        }
    }
}
