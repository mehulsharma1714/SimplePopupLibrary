package com.example.popupit

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater

public class ShowPopup {

    companion object{
        fun loginPopup(context: Context){
            var customLoginPopup = LayoutInflater.from(context).inflate(R.layout.custom_popup_login_form, null)
            var customLoginPopupBuilder = AlertDialog.Builder(context).setView(customLoginPopup)
            customLoginPopupBuilder.show()
        }
    }

}