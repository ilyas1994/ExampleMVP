package com.example.examplemvp

import Presetner.Contract
import Presetner.Presenter
import View.ViewFragmentOne
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragment(ViewFragmentOne())
    }
    fun switchFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.firstFragment, Presenter().switchFragmentTwo(fragment))
            addToBackStack(null)
            commit()
        }
    }
}