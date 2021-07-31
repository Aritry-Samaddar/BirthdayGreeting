package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.createBirthdayButton.setOnClickListener {
//
//        }
    }

    fun createBirthdayCard(view: View) {
        val name = binding.nameInput.editableText.toString()
        Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayGreetingActivity :: class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }

//    override fun onPause() {
//        super.onPause()
//    }

//    override fun onResume() {
//        super.onResume()
//    }

//    override fun onStart() {
//        super.onStart()
//    }

//    override fun onDestroy() {
//        super.onDestroy()
//    }
}