package com.example.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project.databinding.ActivitySecondBinding

class secondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var animals = intent.getParcelableExtra<Animals>(MainActivity.ANIMAL)

        binding.textDescription.text = animals!!.discription

        title = animals?.name
    }
}