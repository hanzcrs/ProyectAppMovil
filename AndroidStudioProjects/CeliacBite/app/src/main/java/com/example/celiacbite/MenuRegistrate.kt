package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuRegistrate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_registrate)

        val btnbackregis: Button = findViewById(R.id.BackRegistrate)
        btnbackregis.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}