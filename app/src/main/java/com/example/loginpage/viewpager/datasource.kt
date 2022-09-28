package com.example.loginpage.viewpager

import androidx.annotation.DrawableRes
import com.example.loginpage.R


data class Pager(
    @DrawableRes val image:Int,
    val des:String
)


val dataList = listOf(
    Pager(R.drawable.illustration1,"Largest Learning Destination"),
    Pager(R.drawable.illustration2,"Highest Succes Numbers"),
    Pager(R.drawable.illustration3,"PUnmatched Tests &  video classes")



)