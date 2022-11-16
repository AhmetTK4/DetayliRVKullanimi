package com.ahmet.detaylirvkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmlerArrayList:ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"Star Wars","f1",19.99)
        val f2 = Filmler(2,"Takeover","f2",17.99)
        val f3 = Filmler(3,"Miraculous","f3",11.99)
        val f4 = Filmler(4,"Pinokyo","f4",12.99)
        val f5 = Filmler(5,"Simpsons","f5",14.99)
        val f6 = Filmler(6,"Rick and Morty","f6",16.99)

    filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmlerAdapter(this,filmlerArrayList)

        rv.adapter = adapter
    }
}