package com.example.gespa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bandejadeentrada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bandejadeentrada)

        val boton6=findViewById<Button>(R.id.btndiez)
        boton6.setOnClickListener{
            val lanzar= Intent(this , menu_principal::class.java)
            startActivity(lanzar)
        }
    }
}