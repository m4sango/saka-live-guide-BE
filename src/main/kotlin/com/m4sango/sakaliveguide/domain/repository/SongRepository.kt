package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.Song
import com.m4sango.sakaliveguide.domain.SongDetail
import com.m4sango.sakaliveguide.domain.value.DiscTitle
import com.m4sango.sakaliveguide.domain.value.Groups
import com.m4sango.sakaliveguide.domain.value.SongName

interface SongRepository {

    fun getSong(songName: SongName, groups: Groups): SongDetail

    fun getAllSongList(groups: Groups): List<Song>

    fun getSongListByDiscTitle(groups: Groups, discTitle: DiscTitle): Map<DiscTitle, List<Song>>
}