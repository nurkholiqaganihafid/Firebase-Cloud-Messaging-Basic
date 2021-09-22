package com.nurkholiq.firebase_cloud_messaging_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.title = "Firebase Cloud Messaging - Nurkholiq"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}