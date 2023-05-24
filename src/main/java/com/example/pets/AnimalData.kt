package com.example.project

import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animals(
    val name: String,
    val discription: String,
    val home: String
    val image: Int
) : Parcelable