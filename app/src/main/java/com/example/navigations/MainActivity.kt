package com.example.navigations

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.navigations.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // відповідає за перетворення XML-розмітки у View-елементи, які можна використовувати у вашій Activity чи Fragment.
        //layoutInflater — це клас, який відповідає за інфляцію (створення) View з XML-ресурсів. Коли ви викликаєте layoutInflater.inflate, ви просите систему перетворити XML-розмітку у відповідні View-елементи.
        setContentView(binding.root)
        Log.d("MainActivity", "onCreate")
        replaceFragment(BlankFragment())

//        binding.bottomNavigation.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.home -> {
//                    replaceFragment(BlankFragment())
//                    true
//                }
//
//                R.id.phone -> {
//                    replaceFragment(BlankFragment3())
//                    true
//                }
//
//                R.id.email -> {
//                    replaceFragment(BlankFragment2())
//                    true
//                }
//
//                else -> {
//                    false
//                }
//            }
//        }

//        binding.ToolBar.setNavigationOnClickListener {
//            Toast.makeText(this, "Navigation icon clicked!", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.ToolBar.setOnMenuItemClickListener { item ->
//            when (item.itemId) {
//                R.id.search -> {
//                    replaceFragment(BlankFragment4())
//                    true
//                }
//                R.id.settings -> {
//                    replaceFragment(BlankFragment5())
//                    true
//                }
//                else -> {
//                    false
//                }
//            }
//        }
        val fragmentAdapter = AFragmentAdapter(this)
        binding.viewPager.adapter = fragmentAdapter
        fragmentAdapter.addFragment(BlankFragment4(), "Home")
        fragmentAdapter.addFragment(BlankFragment5(), "Chat")
            TabLayoutMediator(
            binding.tablayout,
            binding.viewPager
        ) { tab, position -> // це допоміжний клас, який допомагає пов’язати TabLayout з ViewPager
            tab.text = fragmentAdapter.getPageTitle(position)
            if (position == 0)
                tab.view.setBackgroundResource(R.drawable.red_circle)
            when (position) {
                0 -> tab.setIcon(R.drawable.baseline_home_24)
                1 -> tab.setIcon(R.drawable.baseline_email_24)
            }
        }.attach()

        binding.tablayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener { // Цей обробник викликається, коли користувач вибирає вкладку або змінює вибрану вкладку.
            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.view.setBackgroundResource(R.drawable.red_circle)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.view.setBackgroundResource(0) // Забрати фон
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // Нічого не робити
            }
        })
    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager =
            supportFragmentManager  //це властивість AppCompatActivity, яка надає доступ до менеджера фрагментів. який дозволяє здійснювати операції з фрагментами
//        FragmentManager: Використовується для управління фрагментами в активності.
//
//        supportFragmentManager: Використовується для управління фрагментами у рамках AppCompatActivity і забезпечує зворотну сумісність.
//        fragmentManager: Використовується у рамках FragmentActivity (починаючи з API рівня 11) і не забезпечує зворотної сумісності.
// ChildFragmentManager: Це FragmentManager, який використовується всередині фрагментів для управління дочірніми фрагментами.
// LoaderManager: Використовується для управління асинхронними завантажувачами даних в активності або фрагменті.
//  FragmentController: Це внутрішній клас, який використовується для взаємодії між активністю та її фрагментами. Це частина внутрішньої реалізації Android, і вам зазвичай не потрібно використовувати його напряму
        val fragmentTransaction =
            fragmentManager.beginTransaction() // Починає транзакцію фрагментів. Транзакція — це набір операцій, які виконуються над фрагментами (додавання, видалення, заміна тощо).
        fragmentTransaction.replace(R.id.fragment, fragment) // Заміна
        fragmentTransaction.commit() // Це означає, що всі операції, які були додані до транзакції, будуть виконані.
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")

    }
}


//<?xml version="1.0" encoding="utf-8"?>
//<menu xmlns:app="http://schemas.android.com/apk/res-auto"
//xmlns:android="http://schemas.android.com/apk/res/android">
//
//<item android:title="Home"
//android:id="@+id/home"
//android:icon="@drawable/baseline_home_24"/>
//<item android:title="Email"
//android:id="@+id/email"
//android:icon="@drawable/baseline_email_24"/>
//<item android:title="Phone"
//android:id="@+id/phone"
//android:icon="@drawable/baseline_phone_24"/>
//</menu>
