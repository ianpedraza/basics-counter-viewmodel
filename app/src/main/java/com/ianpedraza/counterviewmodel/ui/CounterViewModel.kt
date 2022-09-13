package com.ianpedraza.counterviewmodel.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int> = _counter

    fun onIncrementPressed() {
        if (_counter.value == null) {
            _counter.value = 1
        } else {
            _counter.value = _counter.value!!.inc()
        }
    }

}