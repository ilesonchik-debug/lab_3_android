package com.example.lab3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    val day: Int,

    @StringRes
    val titleRes: Int,

    @StringRes
    val shortDescriptionRes: Int,

    @StringRes
    val fullDescriptionRes: Int,

    @DrawableRes
    val imageRes: Int
)