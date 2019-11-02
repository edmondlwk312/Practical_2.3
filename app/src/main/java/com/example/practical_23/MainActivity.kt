package com.example.practical_23

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View)
    {
        when (view.id)
        {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            //R.id.box_one_c1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_one_c1 -> view.setBackgroundResource(R.drawable.one)
            //R.id.box_two_c1 -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two_c1 -> view.setBackgroundResource(R.drawable.two)
            //R.id.box_three_c1 -> view.setBackgroundColor(Color.BLUE)
            R.id.box_three_c1 -> view.setBackgroundResource(R.drawable.three)
            //R.id.box_four_c1 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_four_c1 -> view.setBackgroundResource(R.drawable.four)
            //R.id.box_five_c1 -> view.setBackgroundColor(Color.BLUE)
            R.id.box_five_c1 -> view.setBackgroundResource(R.drawable.five)

            R.id.box_one_c2 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_c2 -> view.setBackgroundColor(Color.RED)
            R.id.box_three_c2 -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_c2 -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_c2 -> view.setBackgroundColor(Color.MAGENTA)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners()
    {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxOneText2 = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val boxOneC1 = findViewById<TextView>(R.id.box_one_c1)
        val boxTwoC1 = findViewById<TextView>(R.id.box_two_c1)
        val boxThreeC1 = findViewById<TextView>(R.id.box_three_c1)
        val boxFourC1 = findViewById<TextView>(R.id.box_four_c1)
        val boxFiveC1 = findViewById<TextView>(R.id.box_five_c1)

        val boxOneC2 = findViewById<TextView>(R.id.box_one_c2)
        val boxTwoC2 = findViewById<TextView>(R.id.box_two_c2)
        val boxThreeC2 = findViewById<TextView>(R.id.box_three_c2)
        val boxFourC2 = findViewById<TextView>(R.id.box_four_c2)
        val boxFiveC2 = findViewById<TextView>(R.id.box_five_c2)

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxOneText2, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                boxOneC1, boxTwoC1, boxThreeC1, boxFourC1, boxFiveC1,
                boxOneC2, boxTwoC2, boxThreeC2, boxFourC2, boxFiveC2,
                redButton, greenButton, yellowButton
            )

        for (item in clickableViews)
        {
            item.setOnClickListener { makeColored(it) }
        }
    }
}