
package com.example.lab3

object TipRepository {

    private val images = listOf(
        R.drawable.s1,
        R.drawable.s2,
        R.drawable.s3,
        R.drawable.s4,
        R.drawable.s5,
        R.drawable.s6,
        R.drawable.s7,
        R.drawable.s8,
        R.drawable.s9,
        R.drawable.s10
    )

    private val titles = listOf(
        R.string.tip_01_title,
        R.string.tip_02_title,
        R.string.tip_03_title,
        R.string.tip_04_title,
        R.string.tip_05_title,
        R.string.tip_06_title,
        R.string.tip_07_title,
        R.string.tip_08_title,
        R.string.tip_09_title,
        R.string.tip_10_title,
        R.string.tip_11_title,
        R.string.tip_12_title,
        R.string.tip_13_title,
        R.string.tip_14_title,
        R.string.tip_15_title,
        R.string.tip_16_title,
        R.string.tip_17_title,
        R.string.tip_18_title,
        R.string.tip_19_title,
        R.string.tip_20_title,
        R.string.tip_21_title,
        R.string.tip_22_title,
        R.string.tip_23_title,
        R.string.tip_24_title,
        R.string.tip_25_title,
        R.string.tip_26_title,
        R.string.tip_27_title,
        R.string.tip_28_title,
        R.string.tip_29_title,
        R.string.tip_30_title
    )

    private val shortDescriptions = listOf(
        R.string.tip_01_short,
        R.string.tip_02_short,
        R.string.tip_03_short,
        R.string.tip_04_short,
        R.string.tip_05_short,
        R.string.tip_06_short,
        R.string.tip_07_short,
        R.string.tip_08_short,
        R.string.tip_09_short,
        R.string.tip_10_short,
        R.string.tip_11_short,
        R.string.tip_12_short,
        R.string.tip_13_short,
        R.string.tip_14_short,
        R.string.tip_15_short,
        R.string.tip_16_short,
        R.string.tip_17_short,
        R.string.tip_18_short,
        R.string.tip_19_short,
        R.string.tip_20_short,
        R.string.tip_21_short,
        R.string.tip_22_short,
        R.string.tip_23_short,
        R.string.tip_24_short,
        R.string.tip_25_short,
        R.string.tip_26_short,
        R.string.tip_27_short,
        R.string.tip_28_short,
        R.string.tip_29_short,
        R.string.tip_30_short
    )

    private val fullDescriptions = listOf(
        R.string.tip_01_full,
        R.string.tip_02_full,
        R.string.tip_03_full,
        R.string.tip_04_full,
        R.string.tip_05_full,
        R.string.tip_06_full,
        R.string.tip_07_full,
        R.string.tip_08_full,
        R.string.tip_09_full,
        R.string.tip_10_full,
        R.string.tip_11_full,
        R.string.tip_12_full,
        R.string.tip_13_full,
        R.string.tip_14_full,
        R.string.tip_15_full,
        R.string.tip_16_full,
        R.string.tip_17_full,
        R.string.tip_18_full,
        R.string.tip_19_full,
        R.string.tip_20_full,
        R.string.tip_21_full,
        R.string.tip_22_full,
        R.string.tip_23_full,
        R.string.tip_24_full,
        R.string.tip_25_full,
        R.string.tip_26_full,
        R.string.tip_27_full,
        R.string.tip_28_full,
        R.string.tip_29_full,
        R.string.tip_30_full
    )

    val tips = List(30) { index ->
        Tip(
            day = index + 1,
            titleRes = titles[index],
            shortDescriptionRes = shortDescriptions[index],
            fullDescriptionRes = fullDescriptions[index],
            imageRes = images[index % images.size]
        )
    }
}
