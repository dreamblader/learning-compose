package com.dreamblade.composelearn.basiclayout.components.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.basiclayout.components.single.FavoriteCollectionCard
import com.dreamblade.composelearn.basiclayout.data.favoriteCollectionsData

@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(favoriteCollectionsData){ item ->
            FavoriteCollectionCard(
                textId = item.text,
                imageId = item.drawable,
                modifier = Modifier.height(80.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteCollectionsGridPreview() {
    FavoriteCollectionsGrid()
}