package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio: Button = findViewById(R.id.buttonInicio)
        btnInicio.setOnClickListener {

            val intent: Intent = Intent(this, Bienvenido:: class.java)
            startActivity(intent)
        }

        val btnOlvide: Button = findViewById(R.id.ButtonOlvideContra)
        btnOlvide.setOnClickListener {

            val intent: Intent = Intent(this, MenuOlvideContra:: class.java)
            startActivity(intent)
        }

        val btnRegistrarse: Button = findViewById(R.id.ButtonRegistrarse)
        btnRegistrarse.setOnClickListener {

            val intent: Intent = Intent(this, MenuRegistrate:: class.java)
            startActivity(intent)
        }


    }
    }

