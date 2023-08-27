package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            buttonTest1.setOnClickListener{
                Toast.makeText(this@MainActivity, "hallo, selamat datang " + binding.inpNama.text + "!" , Toast.LENGTH_SHORT).show()
            }
        }
    }


}