package com.esosaphilip.composeintroapp.screencounter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CounterViewModel(): ViewModel() {
     private val _counter : MutableState<Int> = mutableStateOf( 0 )
    val counter: MutableState<Int> = _counter

    fun inc() {
        _counter.value++
    }

    fun dnc() {
        _counter.value--
    }
}