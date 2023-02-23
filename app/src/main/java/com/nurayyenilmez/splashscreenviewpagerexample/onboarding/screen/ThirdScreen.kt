package com.nurayyenilmez.splashscreenviewpagerexample.onboarding.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nurayyenilmez.splashscreenviewpagerexample.R
import com.nurayyenilmez.splashscreenviewpagerexample.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {
    private lateinit var binding: FragmentThirdScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentThirdScreenBinding.inflate(layoutInflater,container,false)

        binding.next3.setOnClickListener {
            findNavController().navigate(R.id.action_viewPager_to_homeFragment)
            onBoardingFinished()
        }
        return binding.root

    }

    private fun onBoardingFinished() {
        val sharedPreferences=requireActivity().getSharedPreferences("OnBoarding", Context.MODE_PRIVATE)
        val editor=sharedPreferences.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

}