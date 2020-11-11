package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners(){

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwotext = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews : List<View> =
            listOf(boxOneText, boxTwotext, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it)}
        }
    }

    private fun makeColored(view : View) {
        when(view.id){

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.capucino)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.cireng)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.cloud_beach)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.kopi)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.nasigoreng)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
