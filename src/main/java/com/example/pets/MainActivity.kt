package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val horse = Animals(
            getString(R.string.name_horse),
            getString(R.string.discription_horse),
            R.drawable.friesian
        )
        val dog = Animals(
            getString(R.string.name_dog),
            getString(R.string.discription_dog),
            R.drawable.doberman
        )
        val parrot = Animals(
            getString(R.string.name_parrot),
            getString(R.string.discription_parrot),
            R.drawable.ara
        )

        binding.buttonHorse.setOnClickListener {
            val i = Intent(this, secondActivity::class.java)
            i.putExtra(ANIMAL, horse)
            startActivity(i)
        }

        binding.buttonDog.setOnClickListener {
            val i = Intent(this, secondActivity::class.java)
            i.putExtra(ANIMAL, dog)
            startActivity(i)
        }

        binding.buttonParrot.setOnClickListener {
            val i = Intent(this, secondActivity::class.java)
            i.putExtra(ANIMAL, parrot)
            startActivity(i)
        }

        Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show()

    }

    companion object {
        const val ANIMAL = "key_Animal"
    }
}