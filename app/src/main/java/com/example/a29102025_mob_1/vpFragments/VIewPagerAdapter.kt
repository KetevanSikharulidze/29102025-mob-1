package com.example.a29102025_mob_1.vpFragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VIewPagerAdapter( fa:FragmentActivity, val fList : List<Fragment>): FragmentStateAdapter(fa) {
    override fun getItemCount() = fList.size

    override fun createFragment(position: Int): Fragment {
        return fList[position]
    }

}