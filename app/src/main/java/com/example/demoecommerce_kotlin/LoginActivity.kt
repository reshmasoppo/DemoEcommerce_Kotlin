package com.example.demoecommerce_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.sign_in_design.*


class LoginActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        btn_login.setOnClickListener {

            var intent:Intent=Intent(applicationContext,Home_Activity::class.java)
        }

        // set on-click listener
          tv_signup.setOnClickListener {
              var intent: Intent = Intent(applicationContext,SigunUp_Activity ::class.java)
            startActivity(intent)

        }



    }

}

