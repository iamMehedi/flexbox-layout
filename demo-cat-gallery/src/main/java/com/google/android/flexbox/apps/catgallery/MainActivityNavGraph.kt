package com.google.android.flexbox.apps.catgallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivityNavGraph: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_nav_graph)

        val navController = (supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment).navController
        val graph = navController.navInflater.inflate(R.navigation.nav_main)
        graph.setStartDestination(R.id.nav_main_fragment)

        navController.graph = graph
    }
}