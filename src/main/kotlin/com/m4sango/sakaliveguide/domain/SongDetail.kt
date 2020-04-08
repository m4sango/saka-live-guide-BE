package com.m4sango.sakaliveguide.domain

import com.m4sango.sakaliveguide.domain.value.DiscTitle
import com.m4sango.sakaliveguide.domain.value.SongName

data class SongDetail(
        val songName: SongName,
        val discTitle: DiscTitle
) {
}