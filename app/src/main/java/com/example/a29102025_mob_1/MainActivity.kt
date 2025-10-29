package com.example.a29102025_mob_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(HomeFragment())
        val menu = findViewById<BottomNavigationView>(R.id.bottomNavView)
        menu.setOnItemSelectedListener{ item->
            when(item.itemId){
                R.id.homePage ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.explorePage ->{
                    replaceFragment(ExploreFragment())
                    true

                }
                R.id.profilePage ->{
                    replaceFragment(ProfileFragment())
                    true
                }

                else ->{
                    replaceFragment(HomeFragment())
                    true
                }
            }



        }
    }

    private fun replaceFragment( f : Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main, f)
            .commit()
    }

}