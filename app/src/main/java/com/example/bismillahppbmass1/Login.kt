package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonlogin: Button = findViewById(R.id.buttonlogin)
        buttonlogin.setOnClickListener(this)
    }

    //program pindah halaman ketika buttonlogin ditekan
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.buttonlogin -> {
                    val pindahIntent = Intent(this, Desk::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}

