package com.example.finalprojectcaltax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_income.*

class fund : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund)

        next.setOnClickListener{
            var check = income.income * 0.15
            var reward:Double
            var save:Int
            var private:Double
            if(s1.text.toString() == "")
                reward = 0.0
            else{
                if(s1.text.toString().toDouble() > check){
                    reward = check
                    s1.setText(reward.toString())
                }
                else reward = s1.text.toString().toDouble()
            }
            if(s2.text.toString() == "")
                save = 0
            else{
                if(s2.text.toString().toInt() > 13200){
                    save = 13200
                    s2.setText(save.toString())
                }
                else save = s2.text.toString().toInt()
            }
            if(s3.text.toString() == "")
                private = 0.0
            else{
                if(s3.text.toString().toDouble() > check){
                    private = check
                    s3.setText(private.toString())
                }
                else private = s3.text.toString().toDouble()
            }
            family.reduceTax += reward + save.toDouble() + private
            val intent = Intent(this, calTax::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this, insurance::class.java)
            startActivity(intent)
        }
    }
}