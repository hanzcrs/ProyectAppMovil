package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuRecetas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_recetas)

        val btnback: Button = findViewById(R.id.backRecetas)
        btnback.setOnClickListener {

            val intent: Intent = Intent(this, Bienvenido::class.java)
            startActivity(intent)
        }
    }
}