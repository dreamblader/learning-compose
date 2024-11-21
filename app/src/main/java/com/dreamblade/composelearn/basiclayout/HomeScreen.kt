package com.dreamblade.composelearn.basiclayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.R
import com.dreamblade.composelearn.basiclayout.components.lists.AlignYourBodyRow
import com.dreamblade.composelearn.basiclayout.components.lists.FavoriteCollectionsGrid
import com.dreamblade.composelearn.basiclayout.components.sections.HomeSection
import com.dreamblade.composelearn.basiclayout.components.single.SearchBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Column(modifier.verticalScroll(rememberScrollState())){
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionsGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}