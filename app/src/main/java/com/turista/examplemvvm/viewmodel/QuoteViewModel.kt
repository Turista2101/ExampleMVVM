package com.turista.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.turista.examplemvvm.model.QuoteModel
import com.turista.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }


}