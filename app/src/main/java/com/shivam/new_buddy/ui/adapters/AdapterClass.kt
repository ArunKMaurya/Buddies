package com.shivam.new_buddy.ui.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.shivam.new_buddy.models.DataRec
import com.shivam.new_buddy.R
import com.shivam.new_buddy.ui.activities.ChatActivity

class AdapterClass(val context: Context, val itemList: List<DataRec>) :
    RecyclerView.Adapter<AdapterClass.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_msg, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataRec: DataRec = itemList[position]
//        holder.image.setBackgroundResource(dataRec.image)
        holder.textname.text = dataRec.textname
        holder.textmsg.text = dataRec.textmsg
        holder.time.text = dataRec.time

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, ChatActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: CardView = itemView.findViewById(R.id.cd_img)
        val textmsg: TextView = itemView.findViewById(R.id.tv_msg)
        val textname: TextView = itemView.findViewById(R.id.tv_name)
        val time: TextView = itemView.findViewById(R.id.tv_time)


    }
}




