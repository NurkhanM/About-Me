package com.md.nurkhan.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.md.nurkhan.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDone.setOnClickListener {
            binding.txtName.text = binding.edtName.text
            binding.edtName.visibility = View.GONE
            binding.txtName.visibility = View.VISIBLE
            binding.btnDone.visibility = View.GONE
        }


    }
}