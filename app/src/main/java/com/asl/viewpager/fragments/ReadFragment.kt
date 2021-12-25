package com.asl.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asl.viewpager.data.DataHolder
import com.asl.viewpager.abstracts.FileWriter
import com.asl.viewpager.R
import com.asl.viewpager.abstracts.Json
import com.asl.viewpager.adapters.RecyclerAdapter
import com.asl.viewpager.databinding.FragmentReadBinding


class ReadFragment : Fragment() {
    // TODO: Make Validation of data on click
    // TODO: Make RecyclerView of Persons
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private lateinit var binding: FragmentReadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_read, container, false)
            binding = FragmentReadBinding.bind(view)


            layoutManager = LinearLayoutManager(requireContext())
            binding.recyclerView.layoutManager = layoutManager
            adapter = RecyclerAdapter()
            binding.recyclerView.adapter = adapter

            binding.button2.setOnClickListener{
                DataHolder.setData(
                    Json.toObject(FileWriter.readFile(requireContext(),"JSON_DATA")))
                binding.recyclerView.adapter = RecyclerAdapter()

            }
            return view
        }



}