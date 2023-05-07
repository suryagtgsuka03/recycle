package com.example.recycleviewmodul5

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable (
    val Fotomhs : Int = 0,
    val Namamhs : String,
    val Nimmhs : String,
    val Telpmhs : String
) : Parcelable
