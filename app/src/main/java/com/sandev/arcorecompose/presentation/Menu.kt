package com.sandev.arcorecompose.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sandev.arcorecompose.R
import com.sandev.arcorecompose.domain.Module.item

@Composable
fun Menu() {
    val itemsList = listOf<item>(item("asdf", "ham", R.drawable.burger),
        item("asdfg", "tv", R.drawable.ic_launcher_foreground),
        item("asdfgh", "pokemon", R.drawable.twotone_catching_pokemon_24),
        item("asdfghi", "noodle", R.drawable.instant)
        )

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24), contentDescription = "Previous")
        }

        IconButton(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24), contentDescription = "Next")
        }

    }

}