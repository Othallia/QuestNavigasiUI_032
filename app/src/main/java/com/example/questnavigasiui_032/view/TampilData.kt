package com.example.questnavigasiui_032.view

import android.R.attr.id
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit,
){
    val items = listOf(
        Pair(first = stringResource(id R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(first = stringResource(id R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = stringResource(id R.string.alamat), second = "Yogyakarta"),
    )
}