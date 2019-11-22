package com.example.demoecommerce_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.sign_up_design.*

class SigunUp_Activity:AppCompatActivity()
{

    lateinit var textv_click:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sign_up)
        textv_click= findViewById(R.id.textv_click) as TextView
        signUp_btn.setOnClickListener {
            var intent:Intent= Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent) }
        // set on-click listener
        textv_click.setOnClickListener {

           var intent:Intent= Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)

        }
}

}