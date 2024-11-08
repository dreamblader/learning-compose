package com.dreamblade.composelearn.basiclayout.components.single

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.R

@Composable
fun AlignYourBodyElement(
    textId: Int,
    imageId: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(textId),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )
    }

}


@Preview(showBackground = true, widthDp = 100, heightDp = 150)
@Composable
fun AlignYourBodyElementPreview(){
    AlignYourBodyElement(
        textId = R.string.ab1_inversions,
        imageId = R.drawable.ab1_inversions,
        modifier = Modifier.padding(8.dp)
    )
}