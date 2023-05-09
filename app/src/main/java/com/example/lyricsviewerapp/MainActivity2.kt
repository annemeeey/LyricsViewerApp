package com.example.lyricsviewerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMain2Binding
import com.example.lyricsviewerapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewATW.setOnClickListener(){
            val intent = Intent(this, ATW::class.java)
            startActivity(intent)
        }

        binding.cardViewCS.setOnClickListener(){
            val intent = Intent(this, CS::class.java)
            startActivity(intent)
        }

        binding.cardViewDBM.setOnClickListener(){
            val intent = Intent(this, DBM::class.java)
            startActivity(intent)
        }

        binding.cardViewE.setOnClickListener(){
            val intent = Intent(this, E::class.java)
            startActivity(intent)
        }

        binding.cardViewG.setOnClickListener(){
            val intent = Intent(this, G::class.java)
            startActivity(intent)
        }

        binding.cardViewMNR.setOnClickListener(){
            val intent = Intent(this, MNR::class.java)
            startActivity(intent)
        }
    }
}