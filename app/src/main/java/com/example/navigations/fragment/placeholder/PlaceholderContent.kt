package com.example.navigations.fragment.placeholder

import java.util.ArrayList
import java.util.HashMap

object PlaceholderContent {
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    private val COUNT = 25

    init {
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem(i))
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
    }

    private fun createPlaceholderItem(position: Int): PlaceholderItem {
        return PlaceholderItem(position.toString(), "Item " + position, makeDetails(position))
    }
    //Цей метод створює деталі для кожного елементу списку, щоб потім їх можна було відобразити в UI,
    // наприклад, коли користувач обирає конкретний елемент, він бачить більше інформації про нього.
    // В реальному додатку ці деталі могли б бути справжніми даними про елемент (опис, властивості), а тут це просто приклад згенерованого тексту.
    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    data class PlaceholderItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}