package com.example.testexercise_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.Nullable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


     var number: String? = null

     lateinit var randomgenerator: RandomGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomgenerator = ViewModelProvider(this).get(RandomGenerator::class.java)
    //    val randomGenerator = RandomGenerator()

        var number: String? = randomgenerator.getNumber()

        textView.text = number

        Log.d("suprinder","outside onClickListener")

        button.setOnClickListener {
            textView.text = randomgenerator.getNumber()
            Log.d("suprinder","indside onClickListener")
        }
    }
}
