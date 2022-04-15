package com.shivam.new_buddy.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.shivam.new_buddy.R
import com.shivam.new_buddy.message.SearchProfile

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button=findViewById<TextView>(R.id.signup_btn)
        button.setOnClickListener(){
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
    }
}


