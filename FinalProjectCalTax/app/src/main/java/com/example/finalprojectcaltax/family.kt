package com.example.finalprojectcaltax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_family.*
import kotlinx.android.synthetic.main.activity_income.*
import kotlinx.android.synthetic.main.activity_income.back
import kotlinx.android.synthetic.main.activity_income.next

class family : AppCompatActivity() {

    companion object {
        var reduceTax = 160000.00
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        next.setOnClickListener{
            if(checkBox.isChecked)
                reduceTax += 30000
            if(checkBox2.isChecked)
                reduceTax += 30000
            if(checkBox3.isChecked)
                reduceTax += 60000
            if(checkBox4.isChecked)
                reduceTax += 60000
            if(checkBox5.isChecked)
                reduceTax += 60000
            val intent = Intent(this, fundAndIns::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this, income::class.java)
            startActivity(intent)
        }
    }
}