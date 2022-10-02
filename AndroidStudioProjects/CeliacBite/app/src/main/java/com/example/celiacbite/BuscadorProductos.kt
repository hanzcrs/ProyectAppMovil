package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BuscadorProductos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscador_productos)

        val btn: Button = findViewById(R.id.atras_buscador)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, Bienvenido::class.java)
            startActivity(intent)
        }
    }
}