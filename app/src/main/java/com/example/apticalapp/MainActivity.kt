package com.example.apticalapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnCalc:Button
    lateinit var btnWeb:Button
    lateinit var btnPopup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalc = findViewById(R.id.btncalc)
        btnWeb = findViewById(R.id.btnweb)
        btnPopup = findViewById(R.id.btnalert)

        btnCalc.setOnClickListener {
            var redirect = Intent(this,CalculatorActivity::class.java)
            startActivity(redirect)

        }
        btnWeb.setOnClickListener {
            var Webredirect = Intent(this,WebsiteActivity::class.java)
            startActivity(Webredirect)

        }
        btnPopup.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Exit App")
            alertDialog.setMessage("Are you sure you want to exit the App?")
            alertDialog.setNegativeButton("No",null)
            alertDialog.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            alertDialog.create().show()

        }
    }
}