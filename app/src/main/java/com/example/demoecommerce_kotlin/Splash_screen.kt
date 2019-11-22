package com.example.demoecommerce_kotlin
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.viewpagerindicator.CirclePageIndicator


class Splash_screen : AppCompatActivity()
{
    lateinit var pager1:ViewPager
    private var imageModelArrayList: ArrayList<ImageModel>? = null
    lateinit var Buttn_Signup:Button


    private val myImageList = intArrayOf(R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3)

    val myTextList= arrayOf("Travel to the top of the Space Needle's 520 ft"
        ,"Range of the Pacific Northwest and the highest mountain",
        "The Museum of Flight is a private non-profit air",
        "most popular scenic attractions.","More than 1.5 million",
        "most popular scenic attractions.","More than 1.5 million" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_screen)
        Buttn_Signup=findViewById(R.id.butn_signup)

        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()

        pager1= findViewById(R.id.Pager) as ViewPager
        pager1!!.adapter = SlidingImage_Adapter(this@Splash_screen, this.imageModelArrayList!!)

        Buttn_Signup.setOnClickListener {

            var intent:Intent= Intent(applicationContext,SigunUp_Activity::class.java)
            startActivity(intent)
        }



        val indicator = findViewById(R.id.indicator) as CirclePageIndicator
        indicator.setViewPager(pager1)
         val density = resources.displayMetrics.density
        //Set circle indicator radius
        indicator.setRadius(5 * density)
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageSelected(position: Int)
            {
                currentPage = position
            }
            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {
            }
            override fun onPageScrollStateChanged(pos: Int) {
            }
        })
    }




    private fun populateList():ArrayList<ImageModel>
    {
        val list = ArrayList<ImageModel>()
        for (i in 0..5) {
            val imageModel = ImageModel()
            imageModel.image_drawable = myImageList.get(i)
            imageModel.text_image=myTextList.get(i)
            list.add(imageModel)
        }
        return list
    }
    companion object
    {
        // private var mPager: ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }

}








