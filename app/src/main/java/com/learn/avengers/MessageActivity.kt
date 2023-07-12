package com.learn.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MessageActivity : AppCompatActivity() {
    var textmessage: String? = "NULL"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        if(intent != null){
            textmessage = intent.getStringExtra("newMessage")
            //val text.text = textmessage
        }



    }
}