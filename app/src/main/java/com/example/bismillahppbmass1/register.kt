package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class register : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val buttonregister: Button = findViewById(R.id.buttonregister)
        buttonregister.setOnClickListener(this)
    }
    //program pindah halaman ketika button register ditekan
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.buttonregister -> {
                    val pindahIntent = Intent(this, Login::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }


}