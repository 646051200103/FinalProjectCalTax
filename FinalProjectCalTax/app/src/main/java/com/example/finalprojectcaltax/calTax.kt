package com.example.finalprojectcaltax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cal_tax.*
import kotlinx.android.synthetic.main.activity_income.*
import kotlinx.android.synthetic.main.activity_income.back

class calTax : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_tax)

        var netIncome = income.income - family.reduceTax
        if(netIncome < 0)
            netIncome = 0.00
        var tax:Double
        var netIncomee = "%.2f".format(netIncome)
        textView15.setText(netIncomee.toString())
        if(netIncome <= 150000)
            tax = 0.00
        else if(netIncome <= 300000)
            tax = (netIncome - 150000) * 0.05
        else if(netIncome <= 500000)
            tax = ((netIncome - 300000) * 0.1) + 7500
        else if(netIncome <= 750000)
            tax = ((netIncome - 500000) * 0.15) + 27500
        else if(netIncome <= 1000000)
            tax = ((netIncome - 750000) * 0.2) + 65000
        else if(netIncome <= 2000000)
            tax = ((netIncome - 1000000) * 0.25) + 115000
        else if(netIncome <= 5000000)
            tax = ((netIncome - 2000000) * 0.3) + 365000
        else tax = ((netIncome - 5000000) * 0.35) + 1265000
        var taax = "%.2f".format(tax)
        textView16.setText(taax.toString())

        restart.setOnClickListener{
            income.income = 0.00
            income.salaryYear = 0
            family.reduceTax = 160000.00
            val intent = Intent(this, income::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this, fund::class.java)
            startActivity(intent)
        }
    }
}