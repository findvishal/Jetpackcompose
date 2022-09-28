package com.example.loginpage.viewpager


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import com.google.accompanist.pager.ExperimentalPagerApi

class OnBoardingActivity : ComponentActivity() {


    @OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            OnBoardingScreen()
        }
        }
    }