package com.m4sango.sakaliveguide.infrastructure.repository

import com.m4sango.sakaliveguide.domain.Song
import com.m4sango.sakaliveguide.domain.SongDetail
import com.m4sango.sakaliveguide.domain.repository.SongRepository
import com.m4sango.sakaliveguide.domain.value.DiscTitle
import com.m4sango.sakaliveguide.domain.value.Groups
import com.m4sango.sakaliveguide.domain.value.SongName
import org.springframework.stereotype.Component

@Component
class SongRepositoryImpl : SongRepository {
    override fun getSong(songName: SongName, groups: Groups): SongDetail {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllSongList(groups: Groups): List<Song> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSongListByDiscTitle(groups: Groups, discTitle: DiscTitle): List<Song> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}