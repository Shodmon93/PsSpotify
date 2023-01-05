package com.example.psspotify_v1.data

data class DataTopMixPlay(
    val id : Int,
    val image : Int,
    val artist : String,
    val songName : String,
)
data class DataRecentlyPlayed(
    val id : Int,
    val artist: String,
    val songName: String
)
data class MainScreen (
    val topMix : String,
    val recent : String,
    val popular : String,
    val firstImage : Int,
    val secondImage : Int,
    val thirdImage : Int
        )
