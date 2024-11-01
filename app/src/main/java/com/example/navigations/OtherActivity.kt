package com.example.navigations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigations.databinding.OthermainBinding

class OtherActivity : AppCompatActivity() {
    private lateinit var binding: OthermainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OthermainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    // val navController = findNavController(R.id.fragmentContainerView) Коли ти використовуєш метод findNavController(R.id.fragmentContainerView), він намагається знайти NavController, який пов'язаний безпосередньо з вказаним View (у даному випадку з FragmentContainerView). Цей підхід працює, коли FragmentContainerView вже пов'язаний з NavHostFragment і NavController доступний.

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerViews) as NavHostFragment
        val navController = navHostFragment.navController // получаємо

        binding.buttonNavigationView.setupWithNavController(navController) // надаєм і працюємо

    }
}