package com.asl.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.asl.viewpager.databinding.ActivityMainBinding
// TODO: Setup ViewPager2
// TODO: Class Person(FirstName,Lastname,Age,Email,EyeColor)
// TODO: Check For DataBase Version
// TODO: fun UpdateDataBase() -> Download from Online Database.json To Local Database.json
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


    }
}