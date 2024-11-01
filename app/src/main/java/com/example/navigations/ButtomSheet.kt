package com.example.navigations

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

//class ButtomSheet : BottomSheetDialogFragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_buttom_sheet, container, false)
//    }
//}
//--------------
class ButtomSheet : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttom_sheet, container, false)
    }

//    override fun onStart() {
//        super.onStart()
//
//        // Зміна розміру діалогового вікна
//        dialog?.window?.setLayout(
//            (resources.displayMetrics.widthPixels * 0.8).toInt(),  // Ширина на 80% екрану
//            ViewGroup.LayoutParams.MATCH_PARENT                      // Повна висота
//        )
//    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(requireContext(), R.style.FullScreenDialog2)
    }
//override fun onStart() {
//    super.onStart()
//
//    // Розмір на весь екран
//    dialog?.window?.setLayout(
//        ViewGroup.LayoutParams.MATCH_PARENT,
//        ViewGroup.LayoutParams.MATCH_PARENT
//    )
//}
    // https://www.geeksforgeeks.org/how-to-create-a-full-screen-alertdialog-in-android/ -> AlertDialof full screen
}
