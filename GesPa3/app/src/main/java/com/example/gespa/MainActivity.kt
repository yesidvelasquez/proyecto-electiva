package com.example.gespa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.btnuno)
        boton1.setOnClickListener{
            val lanzar= Intent(this , menu_principal::class.java)
            startActivity(lanzar)
        }
    }



    }


}
}