package com.example.tabbed

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var pager:ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var bar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager=findViewById(R.id.viewPager)
        tabLayout=findViewById(R.id.tabs)
        bar=findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        val adapter=ViewPageAdapter(supportFragmentManager)

        adapter.addFragment(fragment1(),"chats")
        adapter.addFragment(code(),"status")
        adapter.addFragment(leet(),"Calls")

        pager.adapter = adapter

        tabLayout.setupWithViewPager(pager)

    }
}