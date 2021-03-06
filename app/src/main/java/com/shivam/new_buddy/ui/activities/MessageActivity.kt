package com.shivam.new_buddy.ui.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shivam.new_buddy.ui.adapters.AdapterClass
import com.shivam.new_buddy.models.DataRec
import com.shivam.new_buddy.R
import com.shivam.new_buddy.message.SearchProfile

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val recyclerview = findViewById<RecyclerView>(R.id.rv_msg)
        var datamsg = ArrayList<DataRec>()
        for (i in 1..20) {
            datamsg.add(DataRec(R.drawable.p1 + i , "Ridhima" + i ,"Hi!!"+i,"11:15 AM"+i))
        }
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterClass(this,datamsg)
        recyclerview.adapter = adapter

        val button :ImageButton=findViewById(R.id.ib_msg)
        button.setOnClickListener {
            val intent = Intent(this, SearchProfile::class.java)
            startActivity(intent)
        }

    }
}









