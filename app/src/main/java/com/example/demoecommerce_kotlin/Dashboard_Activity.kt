package com.example.demoecommerce_kotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
class Dashboard_Activity : AppCompatActivity()
{

      lateinit var navController: NavController
       override fun onCreate(savedInstanceState: Bundle?)
       {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         //Getting the Navigation Controller
          navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)

        //Setting the navigation controller to Bottom Nav
         //bottomnav.setupWithNavControllor(navController)

         //Setting up the action bar
        NavigationUI.setupActionBarWithNavController(this, navController)

         }

    //Setting Up the back button
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(null, navController)
    }
}


