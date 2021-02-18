package com.example.pg_transparentfragment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        btn_goToActivityB.setOnClickListener {
            Intent(this, ActivityB::class.java)
                .also { startActivity(it) }
        }
    }
}