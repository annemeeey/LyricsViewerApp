package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityAtwBinding

class ATW : AppCompatActivity() {
    private lateinit var binding: ActivityAtwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAtwBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}