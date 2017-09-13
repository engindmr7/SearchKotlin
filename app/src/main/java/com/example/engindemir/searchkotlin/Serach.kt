package com.example.engindemir.searchkotlin

import ir.mirrajabi.searchdialog.core.Searchable

/**
 * Created by engindemir on 28.06.2017.
 */



class Serach (private var mTitle:String?):Searchable{
    override fun getTitle(): String {
        return mTitle!!
    }

}