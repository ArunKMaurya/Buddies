package com.shivam.new_buddy
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass (val context : Context, val itemList: List<DataRec>):RecyclerView.Adapter<AdapterClass.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_msg, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataRec : DataRec = itemList[position]

        holder.textname.text = dataRec.textname
        holder.textmsg.text=dataRec.textmsg
        holder.time.text=dataRec.time
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




