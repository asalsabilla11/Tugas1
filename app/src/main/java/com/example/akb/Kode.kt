package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Kode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode)

        val btnOpenActivity2 : Button = findViewById(R.id.button)
        btnOpenActivity2.setOnClickListener {

            val intent = Intent(this, Biodata :: class.java)
            startActivity(intent)
        }
    }
}
