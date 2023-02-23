package com.nurayyenilmez.splashscreenviewpagerexample.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nurayyenilmez.splashscreenviewpagerexample.R
import com.nurayyenilmez.splashscreenviewpagerexample.adapter.ViewPagerAdapter
import com.nurayyenilmez.splashscreenviewpagerexample.databinding.FragmentViewPagerBinding
import com.nurayyenilmez.splashscreenviewpagerexample.onboarding.screen.FirstScreen
import com.nurayyenilmez.splashscreenviewpagerexample.onboarding.screen.SecondScreen
import com.nurayyenilmez.splashscreenviewpagerexample.onboarding.screen.ThirdScreen


class ViewPager : Fragment() {
    private lateinit var binding:FragmentViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentViewPagerBinding.inflate(layoutInflater,container,false)

        val fragmentList= arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapter=
            ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)
        binding.viewPager2.adapter=adapter
        return binding.root
    }

}