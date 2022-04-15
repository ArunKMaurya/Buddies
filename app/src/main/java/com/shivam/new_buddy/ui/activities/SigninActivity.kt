package com.shivam.new_buddy.ui.activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.shivam.new_buddy.R
class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val back_signin= findViewById<ImageView>(R.id.back_signup)
        back_signin.setOnClickListener(){
            onBackPressed()
        }


    }
}













