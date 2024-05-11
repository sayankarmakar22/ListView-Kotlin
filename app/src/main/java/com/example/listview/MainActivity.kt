package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //simple list view
//        val tasks = arrayListOf<String>()
//        tasks.add("go to gym")
//        tasks.add("buy vegetable and fish")
//        tasks.add("do trading")
//        tasks.add("learn app dev")
//
//        val adapterForTask = ArrayAdapter(this,android.R.layout.simple_list_item_1,tasks)
//
//        binding.listview.adapter = adapterForTask
//
//        binding.listview.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,tasks[position],Toast.LENGTH_SHORT).show()
//        }

        //customized list view
        var name = arrayOf("sayan","tapan","laki")
        var lastMsg = arrayOf("hii","how are you?","hey")
        var lastMsgTime = arrayOf("11.00pm","11.00pm","10,00pm")
        var imageId = intArrayOf(R.drawable.sayan,R.drawable.sayan,R.drawable.sayan)

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i],lastMsg[i],lastMsgTime[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.adapter = MyAdapter(this,userArrayList)

    }
}