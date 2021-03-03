package com.hank.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var secret = 0
    var times = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        secret = Random.nextInt(10) + 1
        message.setText("")
        button.setOnClickListener {
            val num = number.text.toString().toInt()
            val  text = when(num - secret) {
                0 -> "答對了"
                in 1..10 -> "小一點"
                else -> "大一點"
            }
            times++
            counter.setText(times.toString())
            message.setText(text)

        }
    }
}