package com.example.akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_terakhir.*


class Terakhir : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terakhir)

        val nama = intent.getStringExtra(EXTRA_MESSAGE)
        textView9.setText(
            "Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu :)"

        )

        button4.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
