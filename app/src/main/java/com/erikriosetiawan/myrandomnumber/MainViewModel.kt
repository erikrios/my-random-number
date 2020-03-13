package com.erikriosetiawan.myrandomnumber

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private val LOG = MainViewModel::class.java.simpleName

    private val _randomNumber = MutableLiveData<String>()
    val randomNumber: LiveData<String>
        get() = _randomNumber

    init {
        createRandomNumber()
    }

    fun createRandomNumber() {
        _randomNumber.value = Random.nextInt(0, 10).toString()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(LOG, "onCleared() called!")
    }
}