package com.example.popuplibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popupit.ShowPopup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_btn_showpopup.setOnClickListener {
            ShowPopup.loginPopup(this)
        }



    }
}