package com.example.gespa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu_principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val boton2=findViewById<Button>(R.id.btndos)
        boton2.setOnClickListener{
            val lanzar= Intent(this , MainActivity::class.java)
            startActivity(lanzar)
        }
        val boton3=findViewById<Button>(R.id.btntres)
        boton3.setOnClickListener{
            val lanzar= Intent(this , crearcuenta::class.java)
            startActivity(lanzar)
    }
        val boton4=findViewById<Button>(R.id.btnsiete)
        boton4.setOnClickListener{
            val lanzar= Intent(this , bandejadeentrada::class.java)
            startActivity(lanzar)
        }
        val boton8=findViewById<Button>(R.id.btncuatro)
        boton8.setOnClickListener{
            val lanzar= Intent(this , miscuentas::class.java)
            startActivity(lanzar)
        }
        val boton9=findViewById<Button>(R.id.btncinco)
        boton9.setOnClickListener{
            val lanzar= Intent(this , miscuentas::class.java)
            startActivity(lanzar)
        }
}