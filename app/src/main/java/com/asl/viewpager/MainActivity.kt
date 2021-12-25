package com.asl.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asl.viewpager.adapters.FragmentAdapter
import com.asl.viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Clean Up This Garbage
// TODO: fun UpdateDataBase() -> Download from Online Database.json To Local Database.json
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager2 = binding.viewPager
        val adaptor = FragmentAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter = adaptor

        TabLayoutMediator(binding.tabLayout,viewPager2){tab,position->
            when(position){
                0-> tab.text="Read"
                1-> tab.text="Write"
                2-> tab.text="Cutie"
            }
        }.attach()

    }
}