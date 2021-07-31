package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.databinding.ActivityBirthdayGreetingBinding
import com.example.birthdaygreet.databinding.ActivityMainBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    private lateinit var binding: ActivityBirthdayGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(NAME_EXTRA)
        binding.birthdayGreeting.text = "Happy Birthday\n$name!!"
    }
}