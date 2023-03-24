package com.example.finalprojectcaltax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_income.*

class fundAndIns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund_and_ins)

        next.setOnClickListener{
            var check = income.salaryYear * 0.15
            var fund:Double
            var social:Int
            var res:Int
            if(s1.text.toString() == "")
                fund = 0.0
            else {
                if(s1.text.toString().toDouble() > check){
                    fund = check
                    s1.setText(fund.toString())
                }
                else fund = s1.text.toString().toDouble()
            }
            if(s2.text.toString() == "")
                social = 0
            else{
                if(s2.text.toString().toInt() > 9000){
                    social = 9000
                    s2.setText(social.toString())
                }
                else social = s2.text.toString().toInt()
            }
            if(s3.text.toString() == "")
                res = 0
            else{
                if(s3.text.toString().toInt() > 100000){
                    res = 100000
                    s3.setText(res.toString())
                }
                else res = s3.text.toString().toInt()
            }
            family.reduceTax += fund + social.toDouble() + res.toDouble()
            val intent = Intent(this, insurance::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this, family::class.java)
            startActivity(intent)
        }
    }
}