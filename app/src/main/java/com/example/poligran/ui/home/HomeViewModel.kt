package com.example.poligran.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenido, hemos creado esta app, con el fin de ayudarte a aprender el lenguaje Kotlin de manera dinámica y rápida."
    }
    val text: LiveData<String> = _text
}