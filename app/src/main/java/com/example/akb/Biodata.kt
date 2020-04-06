package com.example.akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_biodata.*

class Biodata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        button3.setOnClickListener(){
            val nama = editText2.text.toString()
            val umur = editText3.text.toString()
            if(nama.isEmpty()){
                editText2.setError("Nama tidak boleh Kosong")
            }
            else{
                val intent = Intent(this,Terakhir::class.java)
                    .putExtra(EXTRA_MESSAGE,nama)
                startActivity(intent)
            }
        }


    }
}


