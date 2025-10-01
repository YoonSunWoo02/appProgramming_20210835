package com.example.week4_project_20210835

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var start_text : TextView
    private lateinit var start_switch : Switch
    private lateinit var text_View1 : TextView
    private lateinit var Radio_Group : RadioGroup
    private lateinit var radioButton_oreo : RadioButton
    private lateinit var radioButton_pie : RadioButton
    private lateinit var radioButton_Q : RadioButton
    private lateinit var imageView: ImageView
    private lateinit var button1: Button
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        start_text =findViewById(R.id.start_text)
        start_switch =findViewById(R.id.strat_switch)
        text_View1 =findViewById(R.id.text_View1)
        Radio_Group =findViewById(R.id.radio_Group)
        radioButton_oreo=findViewById(R.id.radioButton_oreo)
        radioButton_pie =findViewById(R.id.radioButton_pie)
        radioButton_Q =findViewById(R.id.radioButton_Q)
        imageView =findViewById(R.id.imageView)
        button1 =findViewById(R.id.button1)
        button2 =findViewById(R.id.button2)

        text_View1.visibility = View.INVISIBLE
        Radio_Group.visibility = View.INVISIBLE
        imageView.visibility = View.INVISIBLE
        button1.visibility = View.INVISIBLE
        button2.visibility = View.INVISIBLE

        start_switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                text_View1.visibility = View.VISIBLE
                Radio_Group.visibility = View.VISIBLE
                imageView.visibility = View.VISIBLE
                button1.visibility = View.VISIBLE
                button2.visibility = View.VISIBLE
            } else {

                text_View1.visibility = View.INVISIBLE
                Radio_Group.visibility = View.INVISIBLE
                imageView.visibility = View.INVISIBLE
                button1.visibility = View.INVISIBLE
                button2.visibility = View.INVISIBLE
            }
        }

        radioButton_oreo.setOnCheckedChangeListener { _,isChecked ->
            if(isChecked){
                imageView.setImageResource(R.drawable.oreo)
            }
        }

        radioButton_pie.setOnCheckedChangeListener { _,isChecked ->
            if(isChecked){
                imageView.setImageResource(R.drawable.pie)
            }
        }

        radioButton_Q.setOnCheckedChangeListener { _,isChecked ->
            if(isChecked){
                imageView.setImageResource(R.drawable.q10)
            }
        }

        button1.setOnClickListener {
            finish()
        }

        button2.setOnClickListener {

            start_switch.isChecked = false
            Radio_Group.clearCheck()
            imageView.setImageResource(R.drawable.ic_launcher)
        }

    }
}