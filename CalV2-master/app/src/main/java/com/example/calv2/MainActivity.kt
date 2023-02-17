package com.example.calv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isNewOp = true
        var str:String
        var ss:String
        var old = 0
        var op = ""
        var op2 = ""
        var result = 0
        var oop = ""

        one.setOnClickListener {
            ss = "1"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        two.setOnClickListener {
            ss = "2"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        three.setOnClickListener {
            ss = "3"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        four.setOnClickListener {
            ss = "4"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        five.setOnClickListener {
            ss = "5"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        six.setOnClickListener {
            ss = "6"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        seven.setOnClickListener {
            ss = "7"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        eight.setOnClickListener {
            ss = "8"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        nine.setOnClickListener {
            ss = "9"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        zero.setOnClickListener {
            ss = "0"
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                if (isNewOp) {
                    ans.setText("")
                }
                isNewOp = false
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        point.setOnClickListener {
            ss = "."
            if (ans.text.toString() == "0")
                ans.setText(ss)
            else {
                str = ans.text.toString().plus(ss)
                ans.setText(str)
            }
        }

        del.setOnClickListener {
            if (ans.text.length != 1) {
                str = ans.text.toString().dropLast(1)
                ans.setText(str)
            }
            else
                str = "0"
                ans.setText(str)
        }

        clear.setOnClickListener {
            str = "0"
            result = 0
            ans.setText("0")
        }

        plus.setOnClickListener {
            isNewOp = true
            var num = ans.text.toString().toInt()
            var new:String = ans.text.toString()
            oop = "+"
            if (op == ""){
                op = "+"
            }
            else if (op2 == ""){
                op2 = "+"
                old = num
                result = new.toInt() + old
                ans.setText("$result")
                op = op2
            }
            else if (op2 != ""){
                old = result
                result = old + new.toInt()
                ans.setText("$result")
                op = op2
                op2 = "+"
            }
        }

        minus.setOnClickListener {
            isNewOp = true
            var num = ans.text.toString().toInt()
            old = num
            op = "-"
            str = "0"
        }

        multiply.setOnClickListener {
            isNewOp = true
            var num = ans.text.toString().toInt()
            old = num
            op = "*"
            str = "0"
        }

        divide.setOnClickListener {
            isNewOp = true
            var num = ans.text.toString().toInt()
            old = num
            op = "/"
            str = "0"
        }

        mod.setOnClickListener {
            isNewOp = true
            var num = ans.text.toString().toInt()
            old = num
            op = "%"
            str = "0"
        }

        equal.setOnClickListener {
            var new = ans.text.toString().toInt()
            if (oop == "+"){
                result = old + new
                ans.setText("$result")
            }
            else if (op == "-"){
                result = old - new
                ans.setText(result.toString())
            }
            else if (op == "*"){
                result = old * new
                ans.setText(result.toString())
            }
            else if (op == "/"){
                if (new == 0){
                    ans.setText("Cannot divide by zero")
                }
                else{
                result = old / new
                ans.setText(result.toString())
                }
            }
            else if (op == "%"){
                if (new == 0){
                    ans.setText("Cannot divide by zero")
                }
                else{
                result = old % new
                ans.setText(result.toString())
                }
            }
        }
    }
}
