package com.m4sango.sakaliveguide.domain

import com.m4sango.sakaliveguide.domain.value.PenColor
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.domain.value.UserId

data class SongColor(
        val songColorId: SongColorId,
        val userId: UserId,
        val songName: SongName,
        val penColor1: PenColor,
        val penColor2: PenColor)