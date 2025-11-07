package com.example.questnavigasiui_032.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget

@OptIn(...markerClass = ExperimentalMaterial3Api::clas)
@Composable
fun FormIsian(
    jenisK:List<String> = ListOf("Laki-laki", "Perempuan"),
    onSubmitBtnClick : () -. Unit
){
    Scaffold (modifier=Modifier,
        topBar ={
            TopAppBar(
                title = {Text(text = stringResource(id=R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700))
            )}
    ){ isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang))
    }
})
