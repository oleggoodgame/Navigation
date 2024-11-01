package com.example.navigations

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
// https://developer.android.com/guide/fragments/lifecycle
class BlankFragment : Fragment() {

    // Викликається, коли фрагмент прикріплюється до активності.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("BlankFragment", "onAttach")
        // Використовуйте для ініціалізації ресурсів, які потребують контексту активності
    }

    // Викликається для ініціалізації фрагмента.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BlankFragment", "onCreate")

        // Використовуйте для ініціалізації, що не залежить від вигляду
    }

    // Викликається для створення та налаштування вигляду фрагмента.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("BlankFragment", "onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    // Викликається після того, як вигляд фрагмента було створено.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("BlankFragment", "onViewCreated")
        // Використовуйте для налаштування вигляду фрагмента після його створення
    }

    // Викликається, коли фрагмент стає видимим для користувача.
    override fun onStart() {
        super.onStart()
        Log.d("BlankFragment", "onStart")
        // Використовуйте для підготовки фрагмента до показу користувачеві
    }

    // Викликається, коли фрагмент починає взаємодіяти з користувачем.
    override fun onResume() {
        super.onResume()
        Log.d("BlankFragment", "onResume")
        // Використовуйте для відновлення оновлень UI, відтворення анімацій і т.д.
    }

    // Викликається, коли фрагмент більше не взаємодіє з користувачем.
    override fun onPause() {
        super.onPause()
        Log.d("BlankFragment", "onPause")
        // Використовуйте для зупинки оновлень UI, збереження змін
    }

    // Викликається, коли фрагмент стає невидимим для користувача.
    override fun onStop() {
        super.onStop()
        Log.d("BlankFragment", "onStop")
        // Використовуйте для зупинки тривалих операцій, що не потрібні, коли фрагмент не видно
    }

    // Викликається для очищення ресурсів, пов'язаних з виглядом фрагмента.
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("BlankFragment", "onDestroyView")
        // Використовуйте для очищення ресурсів, пов'язаних з виглядом
    }

    // Викликається для остаточного знищення фрагмента.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("BlankFragment", "onDestroy")
        // Використовуйте для очищення залишкових ресурсів
    }

    // Викликається, коли фрагмент від'єднується від активності.
    override fun onDetach() {
        super.onDetach()
        Log.d("BlankFragment", "onDetach")
        // Використовуйте для очищення ресурсів, що залежать від контексту активності
    }
}
