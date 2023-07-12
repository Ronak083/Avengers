package com.learn.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AvengersActivity : AppCompatActivity() {

    var titleName: String? = "Avengers"
    lateinit var txtMessage: EditText
    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avengers)

        txtMessage = findViewById(R.id.txtMessage)
        btnSend = findViewById(R.id.btnSend)

        if(intent != null){
            titleName = intent.getStringExtra("Name")
        }
        title = titleName

        btnSend.setOnClickListener{
            val message = txtMessage.text.toString()
            val intent = Intent(this@AvengersActivity,MessageActivity::class.java)
            var newMessage = message
            if(message == null){
                intent.putExtra("newMessage", newMessage)
                startActivity(intent)
            }
        }
    }
}