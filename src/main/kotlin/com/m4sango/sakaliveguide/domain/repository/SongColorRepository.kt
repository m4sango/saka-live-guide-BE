package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.value.Count
import com.m4sango.sakaliveguide.domain.value.PenColor
import com.m4sango.sakaliveguide.domain.value.SongName

interface SongColorRepository {

    fun getSongColorList(songName: SongName): List<SongColor>

    fun countSame(
            songName: SongName,
            penColor1: PenColor,
            penColor2: PenColor
    ): Count

    fun register(songColor: SongColor)
}