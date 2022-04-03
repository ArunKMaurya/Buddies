package com.shivam.new_buddy
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shivam.new_buddy.databinding.ActivityMessageBinding
class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val recyclerview = findViewById<RecyclerView>(R.id.rv_msg)
        var datamsg = ArrayList<DataRec>()
        for (i in 1..20) {
            datamsg.add(DataRec(R.drawable.p1+ i , "Ridhima" + i ,"Hi!!"+i,"11:15 AM"+i))
        }
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterClass(this,datamsg)
        recyclerview.adapter = adapter

    }
}









