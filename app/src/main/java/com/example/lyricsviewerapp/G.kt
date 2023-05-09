package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityGBinding

class G : AppCompatActivity() {
    private lateinit var binding: ActivityGBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}