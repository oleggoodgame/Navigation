package com.example.navigations

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
// використовується для управління фрагментами у ViewPager2. Він забезпечує гнучкий і ефективний спосіб відображення фрагментів у ViewPager2, дозволяючи динамічно додавати, видаляти та оновлювати фрагменти.
class AFragmentAdapter(
    fm: FragmentActivity,
    private val fragmentList: MutableList<Fragment> = mutableListOf(),
    private val fragmentTitleList: MutableList<String> = mutableListOf()
) : FragmentStateAdapter(fm) {
// RecyclerView.Adapter: Цей адаптер використовується, коли ви хочете відображати простіші елементи у ViewPager2
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
