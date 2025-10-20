package com.tibesto.kotlintemplateformapp.presentation.login


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    fun onNameChanged(newName: String) {
        _uiState.update { it.copy(name = newName, errorMessage = null) }
    }

    fun onPasswordChanged(newPassword: String) {
        _uiState.update { it.copy(password = newPassword, errorMessage = null) }
    }

    fun login(onSuccess: () -> Unit = {}) {
        // Simple local check for demo — replace with real auth later
        val current = _uiState.value
        if (current.name == "" && current.password == "") {
            _uiState.update { it.copy(isLoggedIn = true, errorMessage = null) }
            onSuccess()
        } else {
            _uiState.update { it.copy(errorMessage = "Invalid credentials") }
        }
    }
}


