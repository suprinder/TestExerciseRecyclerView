package com.example.testexercise_livedata

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomGenerator: ViewModel(){

      var randomNumber: String? = null

    fun getNumber(): String?{
        if(randomNumber == null) {
            createNumber()
        }
            return randomNumber

    }

    fun createNumber() {

        val number = (1..10).random()
        randomNumber = "Number is : ${number}"

    }
}

