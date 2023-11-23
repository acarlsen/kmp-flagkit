package dev.carlsen.flagkit.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.carlsen.flagkit.AllIcons
import dev.carlsen.flagkit.FlagIcons

@Composable
fun Application() {
    Scaffold {
        FlagList()
    }
}

@Composable
fun FlagList() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Flag icons",
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp, bottom = 32.dp),
            textAlign = TextAlign.Center,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
        )
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth()
                .weight(1f),
            columns = GridCells.Fixed(2),
        ) {
            items(FlagIcons.AllIcons) { icon ->
                Image(
                    imageVector = icon,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(160.dp)
                        .padding(8.dp)
                )
            }
        }
    }
}
