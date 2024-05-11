package com.example.listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity,private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.listview_design,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.listview_design,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val msg = view.findViewById<TextView>(R.id.msg)
        val time = view.findViewById<TextView>(R.id.time)

        name.text = arrayList[position].name
        msg.text = arrayList[position].lastMsg
        time.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].image)
        return view
    }
}