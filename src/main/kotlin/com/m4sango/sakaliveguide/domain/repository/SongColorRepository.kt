package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.SongColor

interface SongColorRepository {

    fun getSongColorList(): List<SongColor>
}