package com.dreamblade.composelearn

import OnboardingScreen
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dreamblade.composelearn.basiclayout.MySootheApp
import com.dreamblade.composelearn.ui.theme.ComposeLearnTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val appState = 1

            when(appState) {
                0 -> {
                    ComposeLearnTheme {
                        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                            MyApp(modifier = Modifier.padding(innerPadding))
                        }
                    }
                }
                1 -> {
                    val windowSizeClass = calculateWindowSizeClass(this)
                    MySootheApp(windowSizeClass)
                }
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(name)
    }
}

@Composable
fun CardContent(name:String){
    var expanded by rememberSaveable { mutableStateOf(false) }

    Row(modifier = Modifier
        .padding(24.dp)
        .animateContentSize()){
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Hello")
            Text(text = name, style= MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold
            ))
            if(expanded){
                Text(
                    text = ("Composem ipsum color sit lazy, " +
                            "padding theme elit, sed do bouncy. ").repeat(4),
                )
            }
        }
        IconButton(modifier = Modifier, onClick = { expanded = !expanded}) {
            Icon(imageVector = if(expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if(expanded) stringResource(R.string.show_less) else stringResource(R.string.show_more))
        }
    }
}

@Composable
fun Greetings(modifier: Modifier = Modifier,
              names: List<String> = List(1000){"$it"}
){
    LazyColumn(modifier.padding(vertical = 4.dp)){
        items(items = names) { name ->
            Greeting(name)
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
            var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

            if(shouldShowOnboarding){
                OnboardingScreen(onContinueClick = {shouldShowOnboarding = false})
            } else{
                Greetings()
            }
        }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "GreetingPreviewDark"
)
@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    ComposeLearnTheme {
        Greetings()
    }
}

@Preview
@Composable
fun MyAppPreview() {
    ComposeLearnTheme {
        MyApp(Modifier.fillMaxSize())
    }
}