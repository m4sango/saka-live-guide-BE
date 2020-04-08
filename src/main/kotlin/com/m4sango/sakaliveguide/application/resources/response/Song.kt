package com.m4sango.sakaliveguide.application.resources.response

import com.m4sango.sakaliveguide.domain.Song as SongDomain

data class Song(
        val songName: String
) {
    companion object {
        fun create(song: SongDomain): Song {
            return Song(song.songName.value)
        }
    }
}