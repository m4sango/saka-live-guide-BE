package com.m4sango.sakaliveguidebe.domain

import com.m4sango.sakaliveguidebe.domain.value.SongName
import com.m4sango.sakaliveguidebe.infrastructure.repository.entity.SongEntity

data class Song(
        val songName: SongName
) {
    companion object {
        fun create(entity: SongEntity): Song {
            return Song(SongName(entity.songName))
        }
    }
}