package com.example.spotifypractice.ui.comparison

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.spotifypractice.R

@Composable
fun TrackCard(
    title: String,
    artistName: String,
    albumArtwork: Painter,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier) {
        Image(
            painter = albumArtwork,
            contentDescription = stringResource(
                R.string.album_artwork_content_description,
                title,
            ),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
        )

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                text = artistName,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}