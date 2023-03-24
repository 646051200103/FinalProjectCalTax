package com.example.finalprojectcaltax

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_income.*
import kotlinx.android.synthetic.main.activity_main.*

class income : AppCompatActivity() {

    companion object {
        var income = 0.00
        var salaryYear = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income)

        next.setOnClickListener{
            if(s1.text.toString() == ""){
                toast {
                    "กรุณากรอกเงินเดือนของคุณ!!"
                }
            }
            else {
                var salary = s1.text.toString().toInt()
                salaryYear = salary * 12
                var bonus:Int
                var another:Int
                if(s2.text.toString() == "")
                    bonus = 0
                else bonus = s2.text.toString().toInt()
                if(s3.text.toString() == "")
                    another = 0
                else another = s3.text.toString().toInt()
                income = salaryYear.toDouble() + bonus.toDouble() + another.toDouble()
                val intent = Intent(this, family::class.java)
                startActivity(intent)
            }
        }
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}