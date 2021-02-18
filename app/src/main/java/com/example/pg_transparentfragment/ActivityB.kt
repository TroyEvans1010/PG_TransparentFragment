package com.example.pg_transparentfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_2, FragmentThatWasActivityA())
            commit()
        }
    }
}