package com.dreamblade.composelearn.basiclayout.components.single


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.R

@Composable
fun FavoriteCollectionCard(
    textId: Int,
    imageId: Int,
    modifier: Modifier = Modifier
){
    Surface(
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier= Modifier.width(255.dp)
        ){
            Image(
                painter = painterResource(imageId),
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(80.dp),
                contentDescription = null
            )
            Text(
                text = stringResource(textId),
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionCardPreview(){
    FavoriteCollectionCard(
        textId = R.string.fc2_nature_meditations,
        imageId = R.drawable.fc2_nature_meditations,
        modifier = Modifier.padding(8.dp)
    )
}

