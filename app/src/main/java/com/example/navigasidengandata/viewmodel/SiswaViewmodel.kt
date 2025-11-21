package com.example.navigasidengandata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasidengandata.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewmodel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableList<String>){
        _statusUI
    }
}