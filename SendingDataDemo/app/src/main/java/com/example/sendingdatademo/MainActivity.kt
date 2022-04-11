package com.example.sendingdatademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sendingdatademo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var student = Student("John Doe", 918558220)

        binding.button.setOnClickListener{
            var intent = Intent(this, Activity2::class.java)
            intent.putExtra("Name", student)
            startActivity(intent)
        }
    }

}