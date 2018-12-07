package com.totemsoft.kutils_lib.general.fragments

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseDialogFragment : DialogFragment(), BaseView {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(getContentResource(), container, false)
        init(view, savedInstanceState)

        return view
    }
}
