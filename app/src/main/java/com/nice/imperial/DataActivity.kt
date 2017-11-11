@file:Suppress("UNREACHABLE_CODE")

package com.nice.imperial

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar

import android.view.View
import android.widget.ImageView

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        text.text = "kotlin"
        text.setTextColor(R.color.colorAccent)
        text.textSize = 22F
        text.setBackgroundColor(R.color.colorPrimary)
        text.setLines(1)
        text.setEms(10)
        image.setImageResource(R.mipmap.ic_launcher_round)
        image.scaleType=ImageView.ScaleType.CENTER_CROP

        text.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"文本",Toast.LENGTH_SHORT).show()
        })
        
        image.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"图片",Toast.LENGTH_SHORT).show()
        })


    }

}


