package com.example.poligran.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Kotlin is a modern programming language that is designed to be fully interoperable with Java. It offers several advantages over Java, including: \n\n - Null safety: Kotlin's type system helps eliminate null pointer exceptions. \n" +
                "\n - Conciseness: Kotlin reduces boilerplate code and provides more expressive syntax. \n\n - Functional programming support: Kotlin supports functional programming paradigms. \n\n - Coroutines: Kotlin provides built-in support for asynchronous programming with coroutines. \n\n\n With these features, Kotlin makes Android app development more efficient and enjoyable. "
    }
    val text: LiveData<String> = _text
}