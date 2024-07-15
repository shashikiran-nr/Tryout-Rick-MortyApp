package com.sash.network

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

// By default the files of network module is accessible based on the
// access specifiers like - Public(default), private, internal... etc
@Composable
fun TestFiles() {
    Text(text = "Hello Network Module")
}