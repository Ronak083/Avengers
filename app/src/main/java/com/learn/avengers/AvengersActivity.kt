package com.learn.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {

    var titleName: String? = "Avengers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avengers)

        if(intent != null){
            titleName = intent.getStringExtra("Name")
        }
        title = titleName
    }
}