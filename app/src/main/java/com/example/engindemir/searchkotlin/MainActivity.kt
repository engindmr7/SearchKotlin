package com.example.engindemir.searchkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.core.SearchResultListener
import ir.mirrajabi.searchdialog.core.Searchable

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            SimpleSearchDialogCompat(this@MainActivity,"Arama","Ne Arıyorsunuz..?",null,

                    initData(), SearchResultListener { baseSearchDialogCompat, item, position ->

                Toast.makeText(this@MainActivity,item.title,Toast.LENGTH_LONG).show()
                baseSearchDialogCompat.dismiss()
            }).show()

        }
    }

    private fun  initData(): ArrayList<Serach>? {

        val items =ArrayList<Serach>()

        items.add(Serach("Android"))
        items.add(Serach("Kotlin"))
        items.add(Serach("Java"))
        items.add(Serach("C++"))
        items.add(Serach("C#"))
        items.add(Serach("Angular JS"))
        items.add(Serach("Node JS"))
        items.add(Serach("Ionic"))
        items.add(Serach("Cordova"))
        items.add(Serach("HTML5"))

        return items




    }
}
