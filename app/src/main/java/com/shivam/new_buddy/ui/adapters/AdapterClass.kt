package com.shivam.new_buddy.ui.adapters
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shivam.new_buddy.models.DataRec
import com.shivam.new_buddy.R
import com.shivam.new_buddy.ui.activities.ChatActivity
class AdapterClass(private val context: Context,val dataRec:List<DataRec>):RecyclerView.Adapter<UserViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_msg,parent,false)

        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user=dataRec[position]
        holder.textmsg.text=user.textmsg
        holder.textname.text=user.textname
        holder.time.text=user.time
        Glide.with(context)
            .load("https://imgk.timesnownews.com/story/raam_nvmii_kii_shubh_kaamnaaeN_6.jpg?tr=w-1200,h-900")
            .into(holder.image)

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, ChatActivity::class.java))
        }




    }

    override fun getItemCount(): Int {
      return dataRec.size
    }



}
    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image:ImageView=itemView.findViewById(R.id.img1)
        val textmsg:TextView=itemView.findViewById(R.id.tv_msg)
        val textname:TextView=itemView.findViewById(R.id.tv_name)
        val time:TextView=itemView.findViewById(R.id.tv_time)

    }










