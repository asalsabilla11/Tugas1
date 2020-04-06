package com.example.akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/*Tanggal Pengerjaan 3 april 2020
* Nama : Annisa Salsabilla
* NIM : 10117196
* Kelas : IF-5/

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_mulai.setOnClickListener(){
            val intent = Intent(this,Kode::class.java)
            startActivity(intent)
        }
    }
}
