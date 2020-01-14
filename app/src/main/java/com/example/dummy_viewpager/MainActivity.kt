package com.example.dummy_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(toolbar)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(OffersFragment(), "Offers")
        adapter.addFragment(RewardFragment(), "Rewards")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

    }
}
