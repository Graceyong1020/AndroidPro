package com.example.ex01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edit1: EditText; lateinit var edit2: EditText
    lateinit var btnAdd: Button; lateinit var btnSub: Button
    lateinit var btnMul: Button; lateinit var btnDiv: Button
    lateinit var btnMod: Button
    lateinit var textResult: TextView
    lateinit var num1: String; lateinit var num2: String
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnMod = findViewById<Button>(R.id.BtnMod)

        textResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnClickListener {
            if (validateInputs()) {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() + num2.toDouble()
                if (result == 0.0) {
                    showZeroResultToast()
                } else {
                    textResult.text = "계산 결과 : " + result.toString()
                }
            }
        }

        btnSub.setOnClickListener {
            if (validateInputs()) {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() - num2.toDouble()
                if (result == 0.0) {
                    showZeroResultToast()
                } else {
                    textResult.text = "계산 결과 : " + result.toString()
                }
            }
        }

        btnMul.setOnClickListener {
            if (validateInputs()) {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() * num2.toDouble()
                if (result == 0.0) {
                    showZeroResultToast()
                } else {
                    textResult.text = "계산 결과 : " + result.toString()
                }
            }
        }

        btnDiv.setOnClickListener {
            if (validateInputs()) {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() / num2.toDouble()
                if (result == 0.0) {
                    showZeroResultToast()
                } else {
                    textResult.text = "계산 결과 : " + result.toString()
                }
            }
        }

        btnMod.setOnClickListener {
            if (validateInputs()) {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() % num2.toDouble()
                if (result == 0.0) {
                    showZeroResultToast()
                } else {
                    textResult.text = "계산 결과 : " + result.toString()
                }
            }
        }
    }

    private fun validateInputs(): Boolean {
        if (edit1.text.isEmpty() || edit2.text.isEmpty()) {
            Toast.makeText(this, "값을 입력하세요", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    private fun showZeroResultToast() {
        Toast.makeText(this, "결과가 0입니다", Toast.LENGTH_SHORT).show()
    }
}