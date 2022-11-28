package com.example.gespa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class miscuentas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miscuentas)

        val boton7=findViewById<Button>(R.id.btndiez)
        boton7.setOnClickListener{
            val lanzar= Intent(this , menu_principal::class.java)
            startActivity(lanzar)
        }
    }
}