package com.ardor.draganddrop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    private val _data: MutableLiveData<List<String>> = MutableLiveData()
    val data: LiveData<List<String>> = _data

    private val _data2: MutableLiveData<List<String>> = MutableLiveData()
    val data2: LiveData<List<String>> = _data2

    fun setData(items: List<String>) {
        _data.value = items
    }

    fun setData2(items: List<String>) {
        _data2.value = items
    }
}