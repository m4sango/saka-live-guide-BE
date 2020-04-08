package com.m4sango.sakaliveguide.domain

import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.infrastructure.repository.entity.SongEntity

data class Song(
        val songName: SongName
) {
    companion object {
        fun create(entity: SongEntity): Song {
            return Song(SongName(entity.songName))
        }
    }
}