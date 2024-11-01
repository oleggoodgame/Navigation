package com.example.navigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
// SafeArgs -> ютуб ще подивитись
class SecondNavigation : Fragment() {
    val arf: SecondNavigationArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_navigation, container, false)
        val text: TextView = view.findViewById(R.id.second)

        // Отримання аргументів
        val args = SecondNavigationArgs.fromBundle(requireArguments())
        // АБО arf
        val number = args.number
        text.text = number.toString()
        text.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.secondNavigationAction)
        }
        return view
    }
}
// це метод, який використовується в фрагментах для отримання Bundle з аргументами, що були передані до цього фрагмента. Він повертає об'єкт Bundle, що містить всі аргументи, які були встановлені при навігації до цього фрагмента.