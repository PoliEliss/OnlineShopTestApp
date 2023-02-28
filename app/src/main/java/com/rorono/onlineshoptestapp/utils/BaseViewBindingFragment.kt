package com.rorono.onlineshoptestapp.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import java.lang.IllegalArgumentException

abstract class BaseViewBindingFragment<VB : ViewBinding>(private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB) :
    BaseFragment() {

    private var _binding: VB? = null
    val binding
    get() = _binding
        ?: throw IllegalArgumentException("Trying to access binding in ${this.lifecycle.currentState} state")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}