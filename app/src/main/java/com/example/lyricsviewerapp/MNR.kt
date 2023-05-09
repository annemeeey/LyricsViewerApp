package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMnrBinding

class MNR : AppCompatActivity() {
    private lateinit var binding: ActivityMnrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMnrBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}