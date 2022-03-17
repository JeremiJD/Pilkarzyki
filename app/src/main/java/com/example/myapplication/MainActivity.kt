package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.RadioButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista =  findViewById<TextView>(R.id.textView2)

        findViewById<RadioButton>(R.id.chicken).setOnClickListener {
            if (findViewById<RadioButton>(R.id.chicken).isChecked) {
                lista.append("Kurczak\n")
            }
        }
        findViewById<RadioButton>(R.id.Noodle).setOnClickListener {
            if (findViewById<RadioButton>(R.id.Noodle).isChecked) {
                lista.append("Noodle\n")
            }
        }
        findViewById<RadioButton>(R.id.Sorbet).setOnClickListener {
            if (findViewById<RadioButton>(R.id.Sorbet).isChecked) {
                lista.append("Sorbet Malinowy\n")
            }
        }
        }
    }
