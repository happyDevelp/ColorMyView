package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()
    }

    private fun setListener() {
        with(binding) {
            //list of clickable Views
            val listOfListeners =
                listOf<View>(
                    boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, constraintBackground,
                    redButton, yellowButton, greenButton )
            for (e in listOfListeners) {
                e.setOnClickListener { makeColored(it) }
            }

        }
    }

    private fun makeColored(view:View) {
        with(binding) {
            when (view) {
                boxOneText -> boxOneText.setBackgroundColor(Color.DKGRAY)
                boxTwoText -> boxTwoText.setBackgroundColor(Color.GRAY)

                boxThreeText -> boxThreeText.setBackgroundResource(android.R.color.holo_green_light)
                boxFourText -> boxFourText.setBackgroundResource(android.R.color.holo_green_dark)
                boxFiveText -> boxFiveText.setBackgroundResource(android.R.color.holo_green_light)

                redButton -> boxThreeText.setBackgroundResource(R.color.my_red)
                yellowButton -> boxFourText.setBackgroundResource(R.color.my_yellow)
                greenButton -> boxFiveText.setBackgroundResource(R.color.my_green)

                else -> constraintBackground.setBackgroundColor(Color.LTGRAY)
            }
        }


    }

}