package com.example.sendingdatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sendingdatademo.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

//        binding.textView.text = intent.getStringExtra("Name")
        val student = intent.getParcelableExtra<Student>("Name")
        binding.textView.text = student!!.name + " " + student!!.studentID
    }
}