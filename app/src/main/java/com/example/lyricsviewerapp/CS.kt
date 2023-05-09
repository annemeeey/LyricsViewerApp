package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityCsBinding

class CS : AppCompatActivity() {
    private lateinit var binding: ActivityCsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}