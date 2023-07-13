package com.learn.avengers

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AvengersActivity : AppCompatActivity() {

    var titleName: String? = "Avengers"
    lateinit var sharedPreferences: SharedPreferences
    lateinit var etMessage: EditText
    lateinit var btnSend: Button
    lateinit var btnLogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.avengers)

        titleName = sharedPreferences.getString("Title", "The Avengers") as String
        title = titleName

        etMessage = findViewById(R.id.etMessage)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener{
            val intent = Intent(this@AvengersActivity,MessageActivity::class.java)
            val message = etMessage.text.toString()
            intent.putExtra("Message", message)
            startActivity(intent)
        }

        btnLogout = findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener{
            startActivity(Intent(this@AvengersActivity,LoginActivity::class.java))
            sharedPreferences.edit().clear().apply()
            finish()
        }

    }
}