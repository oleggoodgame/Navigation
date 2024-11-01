package com.example.navigations.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.ListFragment
import com.example.navigations.R
import com.example.navigations.fragment.placeholder.PlaceholderContent
class ItemFragment : Fragment() {

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //arguments — це властивість фрагмента, яка зберігає Bundle з переданими в нього параметрами (аргументами).
        // Коли ви створюєте фрагмент і хочете передати йому якісь дані, ви можете це зробити через Bundle, використовуючи метод setArguments
        arguments?.let {
            columnCount = it.getInt("0")
        }
        //Це означає, що фрагмент шукає переданий аргумент з ключем "2", і якщо такий аргумент знайдено, він витягує значення (очікується, що це ціле число) і присвоює його змінній columnCount.
    // Використання ?.let означає, що цей блок виконається тільки в тому випадку, якщо arguments не є null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        // Цей код перевіряє, чи є отримане View об'єктом типу RecyclerView. Якщо це та
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyItemRecyclerViewAdapter(PlaceholderContent.ITEMS)
            }
        }
        return view
    }

}

class MyListFragment : ListFragment() {
    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Наповнення даними через адаптер
        val data = arrayOf("Item 1", "Item 2", "Item 3")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, data)
        listAdapter = adapter
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        // Обробка кліка на елемент списку
        super.onListItemClick(l, v, position, id)
        val item = l.getItemAtPosition(position)
        Toast.makeText(context, "Clicked: $item", Toast.LENGTH_SHORT).show()
    }
}