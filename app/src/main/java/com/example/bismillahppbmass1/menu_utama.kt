package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menu_utama : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        val buttonmenu: Button = findViewById(R.id.buttonmenu)
        buttonmenu.setOnClickListener(this)
    }

    //program pindah halaman ketika button menu ditekan
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.buttonmenu -> {
                    val pindahIntent = Intent(this, kalkulatorpertanian::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}



