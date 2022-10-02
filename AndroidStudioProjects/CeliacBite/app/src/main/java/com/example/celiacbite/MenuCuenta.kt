package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_cuenta)

        val btn: Button = findViewById(R.id.backCuenta)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, Bienvenido::class.java)
            startActivity(intent)
        }

        val btnCerrar: Button = findViewById(R.id.CerrarSesion)
        btnCerrar.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}