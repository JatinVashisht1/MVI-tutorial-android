package com.example.mvitutorialyoutube.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.mvitutorialyoutube.presentation.ui.theme.MVITutorialYoutubeTheme
import dagger.hilt.android.AndroidEntryPoint

/*
    Jetpack compose: New ui toolkit by google to make android apps
    Hilt - Jetpack dependency injection
    MVI design pattern - Model View Intent
    Uni-directional
    Retrofit for networking
    abstraction over OkHttp
 */

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVITutorialYoutubeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}
