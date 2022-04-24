package com.shivam.new_buddy.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.shivam.new_buddy.R

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        val back_signup=findViewById<ImageView>(R.id.otp_back2)
        back_signup.setOnClickListener(){
            onBackPressed()
        }
    }
}