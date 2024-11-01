package com.example.navigations.fragment

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.navigations.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

//        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
//            preferenceManager.preferenceScreen = null // Скидає попередній екран
//            preferenceManager.setPreferenceScreen(preferenceScreen)
//            context?.theme?.applyStyle(R.style.CustomPreferenceTheme, true)
//            setPreferencesFromResource(R.xml.root_preferences, rootKey)
//        }
    }
    //rootKey в методі setPreferencesFromResource використовується для визначення конкретної групи налаштувань у файлі root_preferences.xml. Ц
// е дозволяє завантажувати не всі налаштування одразу, а лише певну їх частину, якщо цього вимагає логіка програми. Якщо rootKey дорівнює null, то буде завантажено всі налаштування з файлу.
}
//
//PreferenceFragmentCompat:
//Спеціалізація для налаштувань:
//
//PreferenceFragmentCompat є частиною бібліотеки AndroidX і створений для відображення екранів з налаштуваннями, які зчитуються з XML-файлів у форматі PreferenceScreen. Це зручно, оскільки Android надає спеціальну підтримку для роботи з налаштуваннями через цей клас.
//Зручна робота з XML-файлами налаштувань:
//
//PreferenceFragmentCompat дозволяє легко підключати налаштування з XML-файлів (таких, як root_preferences.xml) через метод setPreferencesFromResource(). Це спрощує роботу з налаштуваннями, і немає потреби вручну обробляти віджети чи макети.
//Автоматичне збереження налаштувань:
//
//При використанні PreferenceFragmentCompat, значення налаштувань автоматично зберігаються у SharedPreferences без додаткового коду. Тобі не потрібно створювати логіку для збереження чи отримання цих налаштувань.
//Зворотна сумісність:
//
//PreferenceFragmentCompat є частиною AndroidX і надає сумісність з більшістю версій Android, включаючи старіші. Це дозволяє використовувати налаштування в додатках, які підтримують різні версії операційної системи.


//class HomeFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
//    }
//
//    @RequiresApi(Build.VERSION_CODES.N)
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        fab_settings.setOnClickListener {
//
//            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
//        }
//        settings()
//    }
//
//
//    @RequiresApi(Build.VERSION_CODES.N)
//    private fun settings() {
//        val sp = PreferenceManager.getDefaultSharedPreferences(context)
//
//        val signature = sp.getString("signature", "")
//        val defaultReplyAction = sp.getString("reply", "")
//        val sync = sp.getBoolean("sync", true)
//        val notifications = sp.getBoolean("notifications", true)
//        val volume = sp.getInt("volume_notifications", 0)
//
//        tv_signature.text = "Signature: $signature"
//        tv_reply.text = "Default reply: $defaultReplyAction"
//        tv_sync.text = "Sync: $sync"
//        tv_notifications.text = "Disable notifications: $notifications"
//
//        pb_volume.setProgress(volume, true)
//
//    }
//
//}


//class CustomPreference(context: Context, attrs: AttributeSet) : Preference(context, attrs) {
//    init {
//        widgetLayoutResource = R.layout.custom_preference_layout
//    }
//
//    override fun onBindViewHolder(holder: PreferenceViewHolder) {
//        super.onBindViewHolder(holder)
//
//        val title = holder.findViewById(R.id.customTitle) as TextView
//        val summary = holder.findViewById(R.id.customSummary) as TextView
//
//        title.text = this.title
//        summary.text = this.summary
//    }
//}
