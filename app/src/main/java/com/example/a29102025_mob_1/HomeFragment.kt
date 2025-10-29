package com.example.a29102025_mob_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.viewpager2.widget.ViewPager2
import com.example.a29102025_mob_1.vpFragments.BlankFragment
import com.example.a29102025_mob_1.vpFragments.BlankFragment2
import com.example.a29102025_mob_1.vpFragments.VIewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    val fList = listOf(BlankFragment(), BlankFragment2())
    val tList =  listOf("fragment1", "fragment2")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = view.findViewById<ViewPager2>(R.id.vp)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val adapter = VIewPagerAdapter(requireActivity(), fList)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab, pos ->
            tab.text = tList[pos]

        }.attach()
    }


    }
