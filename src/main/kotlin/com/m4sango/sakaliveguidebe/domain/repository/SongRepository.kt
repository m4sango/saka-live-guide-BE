package com.m4sango.sakaliveguidebe.domain.repository

import com.m4sango.sakaliveguidebe.domain.Song
import com.m4sango.sakaliveguidebe.domain.SongDetail
import com.m4sango.sakaliveguidebe.domain.value.DiscTitle
import com.m4sango.sakaliveguidebe.domain.value.Groups
import com.m4sango.sakaliveguidebe.domain.value.SongName

interface SongRepository {

    fun getSong(songName: SongName, groups: Groups): SongDetail

    fun getAllSongList(groups: Groups): List<Song>

    fun getSongListByDiscTitle(groups: Groups, discTitle: DiscTitle): Map<DiscTitle, List<Song>>
}