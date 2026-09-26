package com.example.spotifypractice.ui.auth.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LandingScreen(
    onSignInClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onSignInClick,
        modifier = modifier,
    ) {
        Text(text = "Sign in with Spotify")
    }
}