package com.shivam.new_buddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.shivam.new_buddy.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(binding.root)

        Handler().postDelayed( { //This method will be executed once the timer is over
            // Start your app main activity
//            val i = Intent(this, DashboardActivity::class.java)
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}