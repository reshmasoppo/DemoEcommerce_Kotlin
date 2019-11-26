package com.example.demoecommerce_kotlin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment()
{


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
        {
            return inflater.inflate(R.layout.fragment_home, container, false)
        }

      override fun onViewCreated(view: View, savedInstanceState: Bundle?)
     {
         val recyclerview=view.findViewById<RecyclerView>(R.id.recyclerview)
         recyclerview.layoutManager=LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,true)

         val bannerlist=ArrayList<BannerContent>()

         bannerlist.add(BannerContent(R.drawable.img_1,"So may books so little time ","explore"))
         bannerlist.add(BannerContent(R.drawable.img_2,"Be yourself everyone else is already taken","Visit Store"))
         bannerlist.add(BannerContent(R.drawable.img_3,"So may books so little time ","Collection"))

         val adapter =BannerRecyclerViewAdapter( bannerlist)
         recyclerview.setHasFixedSize(true)
         recyclerview.adapter=adapter
         super.onViewCreated(view, savedInstanceState)


    }









}
