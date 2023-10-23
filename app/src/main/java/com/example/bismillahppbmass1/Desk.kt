package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Desk : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desk)

        val buttondesk: Button = findViewById(R.id.buttondesk)
        buttondesk.setOnClickListener(this)
    }
    //program pindah halaman ketika button deskripsii ditekan
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.buttondesk -> {
                    val pindahIntent = Intent(this, menu_utama::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}