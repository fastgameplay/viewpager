package com.asl.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asl.viewpager.R
import com.asl.viewpager.databinding.FragmentReadBinding


class ReadFragment : Fragment() {
    // TODO: Make Validation of data on click
    // TODO: Make RecyclerView of Persons

    private lateinit var binding: FragmentReadBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_read, container, false)
            binding = FragmentReadBinding.bind(view)

            return view
        }



}