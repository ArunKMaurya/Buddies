package com.shivam.new_buddy.ui.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import com.shivam.new_buddy.R
class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val back_signin= findViewById<ImageView>(R.id.back_signup)
        back_signin.setOnClickListener(){
            onBackPressed()
        }
        val otpactivity=findViewById<RelativeLayout>(R.id.otp_btn)
        otpactivity.setOnClickListener(){
            val intent=Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }


    }
}













