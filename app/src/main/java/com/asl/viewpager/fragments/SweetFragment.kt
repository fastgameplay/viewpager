package com.asl.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asl.viewpager.R
import com.asl.viewpager.databinding.FragmentSweetBinding


class SweetFragment : Fragment() {
    //
    // TODO: Function To send data from fields to database
    private lateinit var binding : FragmentSweetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_sweet, container, false)
            binding = FragmentSweetBinding.bind(view)
            binding.imageView.setImageResource(R.drawable.ic_lil_gamer)
            return view
        }


}