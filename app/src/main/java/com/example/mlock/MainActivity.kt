package com.example.mlock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity power"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
    }

    fun cased(){

    }


    fun add1(){
        println("Adding two numbers")
        println("error add branch")
        println("Problem Solved")
    }

    fun sub(){

    }
}
