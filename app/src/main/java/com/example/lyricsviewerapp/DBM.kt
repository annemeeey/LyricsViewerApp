package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityDbmBinding

class DBM : AppCompatActivity() {
    private lateinit var binding: ActivityDbmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDbmBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}