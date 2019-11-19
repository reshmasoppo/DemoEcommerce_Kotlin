package com.example.demoecommerce_kotlin
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_splash_screen.*


class Splash_screenFragment : Fragment()
{
    private var mPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       val rootview= inflater.inflate(R.layout.fragment_splash_screen, container, false)
       mPager = rootview.findViewById<ViewPager>(R.id.Pager)
       mPager!!.adapter = ViewPageradapter(activity!!.supportFragmentManager)
        return rootview

          //https://www.youtube.com/watch?v=0yH1qDxqZMo
          // https://www.youtube.com/watch?v=0yH1qDxqZMo
          //https://www.youtube.com/watch?v=0yH1qDxqZMo(navigation)
          //https://www.raywenderlich.com/6014-the-navigation-architecture-component-tutorial-getting-started

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        b1.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.b1)
//        }
    }






