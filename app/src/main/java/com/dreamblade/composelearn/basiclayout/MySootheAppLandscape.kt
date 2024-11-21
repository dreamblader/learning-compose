package com.dreamblade.composelearn.basiclayout

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dreamblade.composelearn.basiclayout.components.sections.SootheNavigationRail
import com.dreamblade.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun MySootheAppLandscape(){
    ComposeLearnTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ){
            Row {
                SootheNavigationRail()
                HomeScreen()
            }

        }
    }
}

@Preview(showBackground = true, heightDp = 360, widthDp = 630)
@Composable
fun MySootheAppLandscapePreview(){
    MySootheAppLandscape()
}