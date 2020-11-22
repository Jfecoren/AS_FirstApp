package com.example.sixsounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            button.isSelected = !(button.isSelected)
        }
        button2.setOnClickListener {
            button2.isSelected = !(button2.isSelected)
        }
        button4.setOnClickListener {
            button4.isSelected = !(button4.isSelected)
        }
        button5.setOnClickListener {
            button5.isSelected = !(button5.isSelected)
        }
        button6.setOnClickListener {
            button6.isSelected = !(button6.isSelected)
        }
        button7.setOnClickListener {
            button7.isSelected = !(button7.isSelected)
        }

    }
}