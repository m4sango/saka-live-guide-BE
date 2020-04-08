package com.m4sango.sakaliveguidebe.domain.repository

import com.m4sango.sakaliveguidebe.domain.SongColor
import com.m4sango.sakaliveguidebe.domain.value.Count
import com.m4sango.sakaliveguidebe.domain.value.PenColor
import com.m4sango.sakaliveguidebe.domain.value.SongName

interface SongColorRepository {

    fun getSongColorList(songName: SongName): List<SongColor>

    fun countSame(
            songName: SongName,
            penColor1: PenColor,
            penColor2: PenColor
    ): Count

    fun register(songColor: SongColor)
}