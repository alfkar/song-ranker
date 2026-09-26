package com.example.spotifypractice.ui.auth.ui.comparison

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class TrackCardTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    // [itest->req~song-cards-001~2]
    @Test
    fun trackCardDisplaySuppliedMetaData() {
        composeTestRule.setContent {
            MaterialTheme {
                TrackCard(
                    title = "Purple Haze",
                    artistName = "Jimi Hendrix",
                    albumArtwork = ColorPainter(Color.Red)
                )
            }
        }
        composeTestRule.onNodeWithText("Purple Haze").assertIsDisplayed()
        composeTestRule.onNodeWithText("Jimi Hendrix").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Album artwork for Purple Haze").assertIsDisplayed()
    }
}