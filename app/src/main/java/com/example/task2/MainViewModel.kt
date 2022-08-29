package com.example.task2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task2.data.api.ApiServices
import com.example.task2.data.model.DoctorsModel
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

    val response = MutableLiveData<DoctorsModel>()

    fun getData() = viewModelScope.launch {
        val api = ApiServices.getInstance
        val request = api.getDoctorsList()
        if (request.isSuccessful) {
            Log.d("response", request.body().toString())
            response.postValue(request.body())
        } else {
            Log.d("error", request.errorBody().toString())
        }
    }

}