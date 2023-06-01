package com.suicult.biographyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnHakkimda : Button
    lateinit var btnGaleri : Button
    lateinit var btnIletisim : Button
    lateinit var btnGithub : Button

    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHakkimda = findViewById(R.id.btnHakkimda)
        btnGaleri = findViewById(R.id.btnGaleri)
        btnIletisim = findViewById(R.id.btnIletisim)
        btnGithub = findViewById(R.id.btnGithub)

        btnHakkimda.setOnClickListener {
            val intent = Intent(this, activity_hakkimda::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener {
            val intent = Intent(this, activity_galeri::class.java)
            startActivity(intent)
        }

        btnIletisim.setOnClickListener {
            val intent = Intent(this, activity_iletisim::class.java)
            startActivity(intent)
        }

        btnGithub.setOnClickListener {
            startActivity(activity_web.newWebActivity(this,"https://github.com/talhadayanik"))
        }

    }

}