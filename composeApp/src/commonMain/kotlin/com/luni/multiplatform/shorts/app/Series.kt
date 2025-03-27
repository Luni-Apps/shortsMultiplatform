package com.luni.multiplatform.shorts.app

sealed class UiState {
    object Loading : UiState()
    data class Success(val series: List<Series>) : UiState()
    data class Error(val message: String) : UiState()
}

fun test(): UiState {
    val toto: UiState  = UiState.Loading
    when (toto){
        is UiState.Error -> {
            toto.message
        }
        UiState.Loading -> {

        }

        is UiState.Success -> {
            toto.series
        }
    }
    return toto
}

data class Series(val  id: String, val name: String)
