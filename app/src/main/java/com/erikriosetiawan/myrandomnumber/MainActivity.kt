package com.erikriosetiawan.myrandomnumber

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.erikriosetiawan.myrandomnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.randomNumber.observe(this, Observer {
            binding.textViewNumber.text = it
        })

        binding.floatingActionButton.setOnClickListener {
            viewModel.createRandomNumber()
        }
    }
}