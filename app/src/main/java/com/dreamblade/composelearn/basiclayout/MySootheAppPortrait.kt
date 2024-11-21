package com.dreamblade.composelearn.basiclayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dreamblade.composelearn.basiclayout.components.sections.SootheBottomNavigation
import com.dreamblade.composelearn.ui.theme.ComposeLearnTheme

@Composable
fun MySootheAppPortrait(){
    ComposeLearnTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ){ padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MySootheAppPortraitPreview(){
    MySootheAppPortrait()
}