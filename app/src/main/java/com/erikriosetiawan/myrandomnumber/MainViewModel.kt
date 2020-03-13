package com.erikriosetiawan.myrandomnumber

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    init {
        createRandomNumber()
    }

    private val _randomNumber: MutableLiveData<String> = MutableLiveData()
    val randomNumber: LiveData<String>
        get() = _randomNumber

    fun createRandomNumber() {
        _randomNumber.value = Random.nextInt().toString()
    }
}