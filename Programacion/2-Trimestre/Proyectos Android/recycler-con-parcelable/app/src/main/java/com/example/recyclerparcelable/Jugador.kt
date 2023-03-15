package com.example.recyclerparcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Jugador(
    val nombre: String,
    val numero: Int
): Parcelable
