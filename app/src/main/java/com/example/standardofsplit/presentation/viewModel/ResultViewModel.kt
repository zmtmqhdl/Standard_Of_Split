package com.example.standardofsplit.presentation.viewModel

import androidx.compose.ui.text.TextStyle
import androidx.lifecycle.ViewModel
import com.example.standardofsplit.presentation.ui.theme.Typography
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor() : ViewModel() {

    private val _showDetailDialog = MutableStateFlow(false)
    val showDetailDialog: StateFlow<Boolean> = _showDetailDialog

    private val _showResetDialog = MutableStateFlow(false)
    val showResetDialog: StateFlow<Boolean> = _showResetDialog

    private val _accountText = MutableStateFlow("계좌 입력")
    val accountText: StateFlow<String> = _accountText

    private val _showAccountDialog = MutableStateFlow(false)
    val showAccountDialog: StateFlow<Boolean> = _showAccountDialog

    fun changeAccountTextStyle(): TextStyle {
        return if (_accountText.value == "계좌 입력") {
            Typography.accountBeforeStyle
        } else {
            Typography.accountAfterStyle
        }
    }

    fun changeResetDialog() {
        _showResetDialog.value = !_showResetDialog.value
    }

    fun changeAccountDialog() {
        _showAccountDialog.value = !_showAccountDialog.value
    }

    fun changeDetailDialog() {
        _showDetailDialog.value = !_showDetailDialog.value
    }

    fun accountTextUpdate(newName: String) {
        _accountText.value = newName
    }
}