package com.example.psspotify_v1.data

import com.example.psspotify_v1.R

class DataModule {

    companion object{
        val item : ArrayList<DataTopMixPlay> = ArrayList()
        val mainScreenItem : ArrayList<MainScreen> = ArrayList()

        fun setDatMainScreen()  : ArrayList<MainScreen>{
            mainScreenItem.add(
                MainScreen(
                "Top Mix",
                "Recent Played",
                "Popular",
                R.drawable.img_3341,
                    R.drawable.dice_6,
                    R.drawable.dice_6,))
            mainScreenItem.add(
                MainScreen(
                    "Top Mix",
                    "Recent Played",
                    "Popular",
                    R.drawable.img_3341,
                    R.drawable.img_3337,
                    R.drawable.img_3338,))
            mainScreenItem.add(
                MainScreen(
                    "Top Mix",
                    "Recent Played",
                    "Popular",
                    R.drawable.img_3342,
                    R.drawable.img_3342,
                    R.drawable.img_3346,))
            mainScreenItem.add(
                MainScreen(
                    "Top Mix",
                    "Recent Played",
                    "Popular",
                    R.drawable.img_3343,
                    R.drawable.img_3344,
                    R.drawable.img_3350,))
            mainScreenItem.add(
                MainScreen(
                    "Top Mix",
                    "Recent Played",
                    "Popular",
                    R.drawable.img_3337,
                    R.drawable.img_3338,
                    R.drawable.img_3342,))
            return mainScreenItem

        }

        fun setDat() :  ArrayList<DataTopMixPlay>{
            item.add(
                DataTopMixPlay(
                1,
                R.drawable.img_3337,
                    "Linkin Park",
                    "Lost in the echo"))
            item.add(
                DataTopMixPlay(
                    2,
                    R.drawable.img_3338,
                    "Linkin Park",
                    "Lost in the echo"))
            item.add(
                DataTopMixPlay(
                    3,
                    R.drawable.img_3339,
                    "Linkin Park",
                    "Lost in the echo"))
            item.add(
                DataTopMixPlay(
                    4,
                    R.drawable.img_3340,
                    "Linkin Park",
                    "Lost in the echo"))
            item.add(
                DataTopMixPlay(
                    5,
                    R.drawable.img_3341,
                    "Linkin Park",
                    "Lost in the echo"))
            item.add(
                DataTopMixPlay(
                    6,
                    R.drawable.img_3341,
                    "Linkin Park",
                    "Lost in the echo"))
            return item
        }

    }
}