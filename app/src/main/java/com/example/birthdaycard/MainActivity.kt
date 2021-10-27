package com.example.birthdaycard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener { playsound()

        }
    }
    private fun playsound() {
    var sound1= MediaPlayer.create(applicationContext,R.raw.party)
        sound1?.start()
    }


}
