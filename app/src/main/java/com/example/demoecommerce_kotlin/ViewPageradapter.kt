package com.example.demoecommerce_kotlin


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPageradapter(supportFragmentManager:FragmentManager): FragmentStatePagerAdapter(supportFragmentManager)
{
    override fun getItem(position: Int): Fragment {

             if (position==0)
                 return Splashscreen_Fragment1()
             else if(position==1)
                 return Splashscreen_Fragment2()
             else
                 return  Splashscreen_Fragment3()
                  }

             override fun getCount(): Int
              {
               return 3
              }

}