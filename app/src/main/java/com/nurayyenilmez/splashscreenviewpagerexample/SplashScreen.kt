package com.nurayyenilmez.splashscreenviewpagerexample

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nurayyenilmez.splashscreenviewpagerexample.databinding.FragmentSplashScreenBinding


class SplashScreen : Fragment() {
    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSplashScreenBinding.inflate(layoutInflater,container,false)

        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashScreen_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_splashScreen_to_viewPager)
            }
        },3000)

        return binding.root
    }
    private fun onBoardingFinished():Boolean{
        val sharedPreferences=requireActivity().getSharedPreferences("OnBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("Finished",false)
    }


}