package com.example.spotifypractice.ui.auth.ui

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class LandingScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    // [itest->req~spotify-sign-on-button-001~1]
    @Test
    fun signInButtonDisplaysSpotifyText() {
        composeTestRule.setContent { LandingScreen(onSignInClick = {}) }
        composeTestRule.onNodeWithText("Sign in with Spotify").assertExists().assertHasClickAction()
    }
}