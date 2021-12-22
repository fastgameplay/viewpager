package com.asl.viewpager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asl.viewpager.FileHolder
import com.asl.viewpager.Person
import com.asl.viewpager.R
import com.asl.viewpager.databinding.FragmentWriteBinding
import com.google.gson.Gson


class WriteFragment : Fragment() {
    private val personHolder : MutableList<Person> = mutableListOf()
        private lateinit var binding :FragmentWriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_write, container, false)
            binding = FragmentWriteBinding.bind(view)

            binding.button.setOnClickListener{
                personHolder.add( Person(
                    binding.inputFirstNameField.text.toString(),
                    binding.inputLastNameField.text.toString(),
                    binding.inputEmailField.text.toString(),
                    binding.inputMobileField.text.toString(),
                    binding.inputYearField.text.toString()
                ))


                FileHolder.writeJson(requireContext(), Gson().toJson(personHolder),"JSON_DATA")
            }
            return view
        }

}