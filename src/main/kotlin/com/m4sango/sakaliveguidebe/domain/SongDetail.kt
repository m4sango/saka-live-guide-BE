package com.m4sango.sakaliveguidebe.domain

import com.m4sango.sakaliveguidebe.domain.value.DiscTitle
import com.m4sango.sakaliveguidebe.domain.value.SongName

data class SongDetail(
        val songName: SongName,
        val discTitle: DiscTitle
) {
}