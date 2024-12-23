package com.example.navigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ButtonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_button, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_buttonFragment_to_buttomSheet)
        }
        return view
    }
}