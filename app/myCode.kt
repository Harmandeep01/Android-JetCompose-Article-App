package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArticleUI(
                        heading = stringResource( R.string.heading),
                        text1 = stringResource( R.string.text1),
                        text2 = stringResource(R.string.text2),
                        modifier = Modifier.padding(innerPadding),

                        )
                }
            }
        }
    }
}

@Composable
fun Heading(heading: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier){
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp),
        )
    }
}

@Composable
fun TextField1(text1: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
    ){
        Text(
            text = text1,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 0.dp, 19.dp, 0.dp)
        )
    }
}

@Composable
fun TextField2(text2: String, modifier: Modifier = Modifier){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier){
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Composable
fun ArticleUI(heading: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column (modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Heading(
            heading,
            modifier = modifier
        )
        TextField1(
            text1,
            modifier = modifier
        )
        TextField2(
            text2 ,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        ArticleUI(
            stringResource(R.string.heading),
            stringResource(R.string.text1),
            stringResource(R.string.text2)
        )
    }
}