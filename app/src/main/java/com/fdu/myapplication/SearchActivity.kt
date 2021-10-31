package com.fdu.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.SearchView

public class SearchActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_search)
        setContentView(R.layout.activity_main)

        val search_list = ArrayList<String>()
        for (i in 1..30) {
            val temp = "这是第 $i 行"
        }

    }

}