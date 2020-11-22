package com.example.sixsounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var myMedia: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //functions for each button
    fun playSound(view: View) {
        if (myMedia != null) {  //If media var is being reproduced, stop and null it
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){   //If is null, reproduce new sound
            myMedia = MediaPlayer.create(this, R.raw.pew_pew)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button.isSelected = !(button.isSelected)    //Changing state to change color
    }

    fun playSound2(view: View) {
        if (myMedia != null) {
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){
            myMedia = MediaPlayer.create(this, R.raw.funny_laugh1)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button2.isSelected = !(button2.isSelected)
    }

    fun playSound3(view: View) {
        if (myMedia != null) {
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){
            myMedia = MediaPlayer.create(this, R.raw.funny_laugh2)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button7.isSelected = !(button7.isSelected)
    }

    fun playSound4(view: View) {
        if (myMedia != null) {
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){
            myMedia = MediaPlayer.create(this, R.raw.hahaha)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button4.isSelected = !(button4.isSelected)
    }

    fun playSound5(view: View) {
        if (myMedia != null) {
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){
            myMedia = MediaPlayer.create(this, R.raw.sad_trombone)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button5.isSelected = !(button5.isSelected)
    }

    fun playSound6(view: View) {
        if (myMedia != null) {
            myMedia!!.stop()
            myMedia!!.release()
            myMedia = null
        }
        if (myMedia == null){
            myMedia = MediaPlayer.create(this, R.raw.silly_snoring)
            myMedia!!.isLooping = false
            myMedia!!.start()
        }
        button6.isSelected = !(button6.isSelected)
    }

    override fun onStop() {
        super.onStop()
        if (myMedia != null) {
            myMedia!!.release()
            myMedia = null
        }
    }

}

