package com.example.realcalculatortouch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str:String = ""
        var temp:String = ""
        var tempCal:Int = 0
        var total:Int = 0
        var oper:Int = 0
        var t:Int = 0

        no0.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "0"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no1.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "1"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no2.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "2"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no3.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "3"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no4.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "4"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no5.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "5"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no6.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "6"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no7.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "7"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no8.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "8"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        no9.setOnClickListener {
            if(tempCal != 0 && t == 0){
                dis.setText("0")
                t = 1
            }
            temp = "9"
            if(dis.text.toString().toInt() == 0){
                dis.setText(temp)
            }else{
                str = dis.text.toString().plus(temp)
                dis.setText(str)
            }
        }

        del.setOnClickListener {
            //dis.setText(dis.text.toString().dropLast(1))
            if(dis.text.length != 1){
                str = dis.text.toString().dropLast(1)
                dis.setText(str)
            }else{
                str = "0"
                dis.setText(str)
            }
        }

        plus.setOnClickListener {
            tempCal = dis.text.toString().toInt()
            oper = 1
        }

        cal.setOnClickListener {
            if(tempCal != 0){
                if(oper == 1){
                    total = dis.text.toString().toInt() + tempCal
                    dis.setText(total)
                    oper = 0
                }
            }
//            tempCal = dis.text.toString().toInt()
//            dis.setText("0")
//            str = dis.text.toString()
        }
    }
}