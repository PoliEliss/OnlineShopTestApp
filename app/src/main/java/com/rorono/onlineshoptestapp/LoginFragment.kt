package com.rorono.onlineshoptestapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rorono.onlineshoptestapp.databinding.FragmentLogInBinding

import com.rorono.onlineshoptestapp.utils.BaseViewBindingFragment


class LoginFragment : BaseViewBindingFragment<FragmentLogInBinding>(FragmentLogInBinding::inflate) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sig_in_, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}