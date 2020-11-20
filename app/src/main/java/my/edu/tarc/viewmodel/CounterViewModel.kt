package my.edu.tarc.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var globalCounter: Int

    init {  //Initialization
        globalCounter = 0
        Log.i("Counter View Model", "Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("Counter View Model", "Cleared")
    }

    fun increaseCounter() {
        globalCounter = globalCounter.plus(1)
    }

    fun decreaseCounter() {
        globalCounter = globalCounter.minus(1)
    }
}