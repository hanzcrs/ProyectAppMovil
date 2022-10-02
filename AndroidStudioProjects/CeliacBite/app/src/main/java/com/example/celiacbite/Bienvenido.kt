package com.example.celiacbite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Bienvenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        val btn: Button = findViewById(R.id.back)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnProd: Button = findViewById(R.id.Productos)
        btnProd.setOnClickListener {

            val intent: Intent = Intent(this, BuscadorProductos::class.java)
            startActivity(intent)
        }

        val btnResets: Button = findViewById(R.id.Recetas)
        btnResets.setOnClickListener {

            val intent: Intent = Intent(this, MenuRecetas::class.java)
            startActivity(intent)
        }

        val btnUser : ImageButton = findViewById(R.id.AccesoUsuario)
             btnUser.setOnClickListener {
                 val intent: Intent = Intent(this, MenuCuenta::class.java)
                 startActivity(intent)

             }


    }
}