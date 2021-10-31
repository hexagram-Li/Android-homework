package com.fdu.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView


public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_search)
        setContentView(R.layout.activity_main)

        val search_list = ArrayList<String>()
        for (i in 1..30) {
            search_list.add("这是第 $i 行")
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, search_list)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
        val searchView = findViewById<SearchView>(R.id.searchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(p0: String?): Boolean {
                //通过首字符筛选内容
                adapter.filter.filter(p0)
                return false
            }
        })
    }

}

