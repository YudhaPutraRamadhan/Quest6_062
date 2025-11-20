package com.example.navigationquest.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationquest.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
) {

    val items = listOf(
        stringResource(id = R.string.nama_lengkap) to "Contoh Name",
        stringResource(id = R.string.jenis_kelamin) to "Lainnya",
        stringResource(id = R.string.alamat) to "Yogyakarta"
    )

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(

                        text = stringResource(id = R.string.tampil),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))
            ) {
                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 22.sp
                        )
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackBtnClick
                ) {
                    Text(text = stringResource(id = R.string.back))
                }
            }
        }
    }
}