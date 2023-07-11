package com.learn.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin:Button
    lateinit var txtForgetPassword: TextView
    lateinit var txtRegister:TextView
    val validMobileNumber = "0123456789"
    val validPassword = "thanos"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Login Page"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener{
            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()
            if (mobileNumber == validMobileNumber && password == validPassword){
                val intent = Intent(this@MainActivity,MainActivity::class.java)
                startActivity(intent)
            }
            Toast.makeText(this@MainActivity,"Button Clicked for Toast",Toast.LENGTH_LONG).show()
        }


    }
}