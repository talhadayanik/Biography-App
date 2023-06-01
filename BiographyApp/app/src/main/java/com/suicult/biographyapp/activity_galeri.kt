package com.suicult.biographyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class activity_galeri : AppCompatActivity() {

    lateinit var btnBack : ImageButton

    lateinit var txtPlayStoreZenblock : TextView
    lateinit var imgExternalLinkZenblock : ImageView
    lateinit var imgZenblock0 : ImageView
    lateinit var imgZenblock1 : ImageView
    lateinit var imgZenblock2 : ImageView

    lateinit var txtPlayStoreFlappyCat : TextView
    lateinit var imgExternalLinkFlappyCat : ImageView
    lateinit var imgFlappyCat0 : ImageView
    lateinit var imgFlappyCat1 : ImageView
    lateinit var imgFlappyCat2 : ImageView
    lateinit var imgFlappyCat3 : ImageView
    lateinit var imgFlappyCat4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        btnBack = findViewById(R.id.btnBack)

        txtPlayStoreZenblock = findViewById(R.id.txtPlayStoreZenblock)
        imgExternalLinkZenblock = findViewById(R.id.imgExternalLinkZenblock)
        imgZenblock0 = findViewById(R.id.imgZenblock0)
        imgZenblock1 = findViewById(R.id.imgZenblock1)
        imgZenblock2 = findViewById(R.id.imgZenblock2)

        txtPlayStoreFlappyCat = findViewById(R.id.txtPlayStoreFlappyCat)
        imgExternalLinkFlappyCat = findViewById(R.id.imgExternalLinkFlappyCat)
        imgFlappyCat0 = findViewById(R.id.imgFlappyCat0)
        imgFlappyCat1 = findViewById(R.id.imgFlappyCat1)
        imgFlappyCat2 = findViewById(R.id.imgFlappyCat2)
        imgFlappyCat3 = findViewById(R.id.imgFlappyCat3)
        imgFlappyCat4 = findViewById(R.id.imgFlappyCat4)

        Glide.with(this).load("https://play-lh.googleusercontent.com/P8WLjvTfpo3JUAvckkZ6GWz4YLmMs5xrJn-xhuZYH3mZYZe03YVKT6BLtgJElk75g9Hq=w526-h296-rw").into(imgZenblock0)
        Glide.with(this).load("https://play-lh.googleusercontent.com/Xki-BTiLOyGu7DFWjXo8KZ0yWvDJabHbu2SCpGvY3Ib4YRPQob_sEj8Yx4yH74YKHH8=w2560-h1440-rw").into(imgZenblock1)
        Glide.with(this).load("https://play-lh.googleusercontent.com/VWF1bRWy4GhlJMR-dEzm8KGV5LK7Msi-9bSf9yXsF2ckbwxOMaPDJ7YocZK3NG4WOzMf=w526-h296-rw").into(imgZenblock2)

        Glide.with(this).load("https://play-lh.googleusercontent.com/fN4E5Vi1kC9t-SdFawrGuJFLVzt5eHcLXISZuV1rp15F3CDWG8BlFxCPhhmjBzTFYAE=w526-h296-rw").into(imgFlappyCat0)
        Glide.with(this).load("https://play-lh.googleusercontent.com/7f4YMm0r-rTpaFGLEM83taESy7ZX6cQJIv1isxiE7RKdz1_6VUD8GlSyKxElGb-CbBY=w526-h296-rw").into(imgFlappyCat1)
        Glide.with(this).load("https://play-lh.googleusercontent.com/awn32lZPZPF_j1eHhulC3DRtKzfEP43yFe738iiRS7lLs77v62y_tCg8Bfw4G8qNHg=w526-h296-rw").into(imgFlappyCat2)
        Glide.with(this).load("https://play-lh.googleusercontent.com/KgjcBPS5iz6RCAcTMP59GYSCRppSKHli9mxbXFnc8pC3QL1sSZpLuQsaEEqfhRDHow=w526-h296-rw").into(imgFlappyCat3)
        Glide.with(this).load("https://play-lh.googleusercontent.com/5tb_yUEILfJdJNpNSK3wm3eqhtrbmxTZ4r-BC8pAp74LLzw2RDt_oTyaRPUFM9yFtQ=w526-h296-rw").into(imgFlappyCat4)

        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        txtPlayStoreZenblock.setOnClickListener {
            startActivity(activity_web.newWebActivity(this, "https://play.google.com/store/apps/details?id=com.suicult.zenblock"))
        }

        imgExternalLinkZenblock.setOnClickListener {
            startActivity(activity_web.newWebActivity(this,"https://play.google.com/store/apps/details?id=com.suicult.zenblock"))
        }

        txtPlayStoreFlappyCat.setOnClickListener {
            startActivity(activity_web.newWebActivity(this,"https://play.google.com/store/apps/details?id=com.suicult.flappycat"))
        }

        imgExternalLinkFlappyCat.setOnClickListener {
            startActivity(activity_web.newWebActivity(this,"https://play.google.com/store/apps/details?id=com.suicult.flappycat"))
        }
    }
}