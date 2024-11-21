package com.dreamblade.composelearn.basiclayout.components.sections

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.R
import com.dreamblade.composelearn.basiclayout.components.lists.AlignYourBodyRow

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column (modifier){
        Text(text = stringResource(title),
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                .padding(start = 16.dp),
            style = MaterialTheme.typography.titleMedium
        )
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun HomeSectionPreview(){
    HomeSection(R.string.align_your_body){
        AlignYourBodyRow()
    }
}