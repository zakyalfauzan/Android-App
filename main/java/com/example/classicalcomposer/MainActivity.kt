package com.example.classicalcomposer

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvComposer: RecyclerView
    private var list = ArrayList<Composer>()
    private lateinit var imgPhoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvComposer = findViewById(R.id.rv_composer)
        rvComposer.setHasFixedSize(true)

        list.addAll(ComposerData.listData)
        showRecycler()
    }

    private fun showRecycler() {

        rvComposer.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rvComposer.adapter = cardViewAdapter
        cardViewAdapter.setOnItemClickListener(object : CardViewAdapter.onItemClickListener{
            override fun onItemClick(item: Composer, position: Int) {
                val intent = Intent(this@MainActivity,ComposerDetailActivity::class.java)
                intent.putExtra("COMPOSER_NAME", item.name)
                intent.putExtra("COMPOSER_YEAR", item.year)
                intent.putExtra("COMPOSER_DETAIL", item.detail)
                intent.putExtra("COMPOSER_SONATA", item.sonata)
            }
        })
    }
}