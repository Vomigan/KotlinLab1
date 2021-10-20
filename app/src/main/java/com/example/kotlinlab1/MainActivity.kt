package com.example.kotlinlab1

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.sql.DriverManager.println
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.Calendar;

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val now = LocalDateTime.now()
        var formatter = DateTimeFormatter.ofPattern("EEEE")
        textView = findViewById(R.id.TV1)
        textView.text = formatter.format(now)

    }
}