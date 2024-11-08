package com.dreamblade.composelearn.basiclayout.components.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.basiclayout.components.single.AlignYourBodyElement
import com.dreamblade.composelearn.basiclayout.data.alignYourBodyData

@Composable
fun AlignYourBodyRow(
    modifier: Modifier
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        items(alignYourBodyData){ item->
            AlignYourBodyElement(
                imageId = item.drawable,
                textId = item.text
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun AlignYourBodyRowPreview(){
    AlignYourBodyRow(
        modifier = Modifier.padding(8.dp)
    )
}