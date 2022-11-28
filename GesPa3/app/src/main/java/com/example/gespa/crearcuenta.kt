package com.example.gespa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class crearcuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crearcuenta)

        val boton5=findViewById<Button>(R.id.btnseis)
        boton5.setOnClickListener{
            val lanzar= Intent(this , menu_principal::class.java)
            startActivity(lanzar)
        }
    }
}