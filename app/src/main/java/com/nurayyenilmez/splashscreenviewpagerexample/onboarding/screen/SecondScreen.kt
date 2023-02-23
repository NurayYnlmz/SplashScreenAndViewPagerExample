package com.nurayyenilmez.splashscreenviewpagerexample.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.nurayyenilmez.splashscreenviewpagerexample.R
import com.nurayyenilmez.splashscreenviewpagerexample.databinding.FragmentSecondScreenBinding


class SecondScreen : Fragment() {
   private lateinit var binding: FragmentSecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSecondScreenBinding.inflate(layoutInflater,container,false)


        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        binding.next2.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return binding.root
    }

}