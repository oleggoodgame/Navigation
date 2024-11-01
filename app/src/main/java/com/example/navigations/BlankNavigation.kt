package com.example.navigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation

class BlankNavigation : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank_navigation, container, false)
        val text: TextView = view.findViewById(R.id.firstS)
        text.setOnClickListener{
//            Toast.makeText(requireContext(), "SUKA", Toast.LENGTH_SHORT).show(
            val action = BlankNavigationDirections.firstNavigationAction(224)  // Це метод у класі BlankNavigationDirections, який відповідає за навігацію до певного фрагмента. У цьому випадку, метод очікує один аргумент (у даному випадку, це число 224), яке буде передане як аргумент number до цільового фрагмента (тобто фрагмента, до якого виконується навігація).
            val actionss = BlankNavigationDirections
                .firstNavigationAction( number=100) // Трхи гірше

//
//            Процес генерації: Коли ти визначаєш action і argument у navigation.xml, SafeArgs генерує для них відповідні методи та класи. Це значно зменшує ризик помилок, оскільки ти працюєш з типами даних, які компілюються, а не зі "сирими" рядками чи ID.
            // BlankNavigationDirections: Це автоматично згенерований клас, створений плагіном SafeArgs на основі navigation.xml. Він містить усі можливі напрямки (actions) для навігації з цього конкретного фрагмента.

            Navigation.findNavController(requireView()).navigate(action) // Цей метод виконує фактичну навігацію, використовуючи об'єкт NavDirections (у цьому випадку, action). Цей об'єкт містить всю необхідну інформацію, щоб перейти до іншого фрагмента, включаючи передані аргументи, анімації, тощо.

        }
        return view
    }


}



//Додаткові можливості SafeArgs і NavController
//Передача декількох аргументів:
//
//Можна передати кілька аргументів, визначивши їх у navigation.xml, а потім передати ці значення через методи, згенеровані SafeArgs.
//Навігація до інших фрагментів:
//
//Можна створити кілька action для одного фрагмента, кожен з яких веде до іншого фрагмента або навіть до того самого, але з різними параметрами.
//Перехід із різними типами даних:
//
//SafeArgs підтримує передачу різних типів даних: рядки, числа, булеві значення, списки і навіть складні об'єкти, якщо вони реалізують Parcelable або Serializable.
//Попередній перегляд навігації:
//
//У Android Studio є попередній перегляд навігації, де можна побачити, як буде виглядати навігаційна структура і які переходи можливі.
//Перевірка аргументів:
//
//SafeArgs автоматично перевіряє типи даних аргументів, що передаються, що запобігає багатьом помилкам під час компіляції.
//Навігація за умовою:
//
//У деяких випадках, перед навігацією, можна перевірити умови або дані і, залежно від них, вибрати інший напрямок навігації або зовсім не виконувати її.