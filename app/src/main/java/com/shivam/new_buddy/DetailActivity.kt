package com.shivam.new_buddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shivam.new_buddy.databinding.ActivityDashboardBinding
import com.shivam.new_buddy.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var bind: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }



}