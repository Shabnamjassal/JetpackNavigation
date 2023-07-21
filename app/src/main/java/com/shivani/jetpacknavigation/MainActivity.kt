package com.shivani.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.shivani.jetpacknavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.navHost)
        binding.bottomView.setOnItemSelectedListener {
            if(it.itemId == R.id.home) {
                navController.navigate(R.id.firstFragment)
            }else if(it.itemId==R.id.search){
                navController.navigate(R.id.secondFragment)
            }else if(it.itemId==R.id.post) {
                navController.navigate(R.id.thirdFragment)
            }else if(it.itemId==R.id.reels) {
                navController.navigate(R.id.fourthFragment)
            }else if(it.itemId==R.id.profile){
                navController.navigate(R.id.fifthFragment)
            }
            return@setOnItemSelectedListener true
        }
    }
}