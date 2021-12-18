package com.asl.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.asl.viewpager.fragments.ReadFragment
import com.asl.viewpager.fragments.WriteFragment
import com.asl.viewpager.fragments.SweetFragment



class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ReadFragment()
            1 -> WriteFragment()
            2 -> SweetFragment()
            else -> Fragment()
        }
    }

}