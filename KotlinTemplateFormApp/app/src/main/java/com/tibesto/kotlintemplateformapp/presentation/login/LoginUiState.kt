package com.tibesto.kotlintemplateformapp.presentation.login

data class LoginUiState (

    val name: String = "",
    val password: String = "",
    val isLoggedIn: Boolean = false,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
