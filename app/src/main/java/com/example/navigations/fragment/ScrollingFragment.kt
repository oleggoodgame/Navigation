package com.example.navigations.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigations.R

class ScrollingFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_scrolling, container, false)
    }

//    fun setHidingToolbar(view: View, toolbar: Toolbar) {
//        view.setOnTouchListener { v, event ->
//            when (event. action ) {
//                MotionEvent. ACTION_DOWN -> {
//                    x = подія. x
//                    y = подія. y
//                }
//
//                MotionEvent. ACTION_UP -> {
//                    if ( abs ( x - подія. x ) < SCROLL_THRESHOLD || abs ( y - подія. y ) < SCROLL_THRESHOLD ){
//                        toggleToolbar (панель інструментів)
//                    }
//                }
//            }
//            v.performClick()
//            v.onTouchEvent(event) ?: вірно
//        }
//    }
}


