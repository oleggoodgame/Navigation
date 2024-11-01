package com.example.navigations

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
// ДЛЯ VIEWPAGER
// одним словом для старого
class FragmentActivity(fm: Fragment) : FragmentStateAdapter(fm) {

    private val fragmentList: MutableList<Fragment> = mutableListOf()
    private val fragmentTitleList: MutableList<String> = mutableListOf()

    override fun getItemCount(): Int {
        return fragmentList.size
    }



    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    // Метод для отримання заголовків фрагментів
    fun getPageTitle(position: Int): CharSequence {
        return fragmentTitleList[position]
    }
}
