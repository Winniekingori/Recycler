package com.example.nameactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager = LinearLayoutManager(baseContext)

        val namesAdapter = NamesRecyclerViewAdapter(listOf <String>
            (name="Grace", age=23, hobby="Cooking", DOB=30/7/1997))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>
                (name="Apprelle", age=20, hobby="Dancing", DOB=30/7/1990))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>(name="Ann", age=22, hobby="Dancing", DOB=30/7/1998))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf <String>
            (name="Winnie", age=25, hobby="swimmming", DOB=7/12/1994))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>
            ( name="Betty", age=19, hobby="Running", DOB=5/2/2000))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>(name="Abigael", age=21, hobby="Skating", DOB=15/2/1999))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>(name="Wendy", age=30, hobby="Watching", DOB=15/7/1990))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>(name="Abel", age=22, hobby="singing", DOB=30/5/1998))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf<String>(name="Caro", age=27, hobby="jumping", DOB=8/8/1993))
        rvNames.adapter = namesAdapter
        val namesAdapter = NamesRecyclerViewAdapter(listOf(name="Isaack", age=24, hobby="Traveling", DOB=))
        rvNames.adapter = namesAdapter
    }
}
