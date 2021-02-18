package com.example.pg_transparentfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, FragmentThatWasActivityA())
            commit()
        }
    }
}