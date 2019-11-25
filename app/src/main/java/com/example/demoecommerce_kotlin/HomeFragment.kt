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
         val users=ArrayList<User>()
         users.add(User(R.drawable.img_1,"Reshma"))
         users.add(User(R.drawable.img_2,"Veena"))
         val adapter =RecyclerViewAdapter(users)
         recyclerview.setHasFixedSize(true)
         recyclerview.adapter=adapter
         super.onViewCreated(view, savedInstanceState)


    }









}
