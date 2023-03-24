package com.example.finalprojectcaltax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_income.*

class insurance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insurance)

        next.setOnClickListener{
            var life:Int
            var health:Int
            var healthup:Int
            if(s1.text.toString() == "")
                life = 0
            else{
                if(s1.text.toString().toInt() > 100000){
                    life = 100000
                    s1.setText(life.toString())
                }
                else life = s1.text.toString().toInt()
            }
            if(s2.text.toString() == "")
                health = 0
            else{
                if(s2.text.toString().toInt() > 25000){
                    health = 25000
                    s2.setText(health.toString())
                }
                else health = s2.text.toString().toInt()
            }
            if(s3.text.toString() == "")
                healthup = 0
            else{
                if(s3.text.toString().toInt() > 15000){
                    healthup = 15000
                    s3.setText(healthup.toString())
                }
                else healthup = s3.text.toString().toInt()
            }
            family.reduceTax += life.toDouble() + health.toDouble() + healthup.toDouble()
            val intent = Intent(this, fund::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this, fundAndIns::class.java)
            startActivity(intent)
        }
    }
}