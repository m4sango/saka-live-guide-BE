package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.repository.SongRepository
import com.m4sango.sakaliveguide.domain.service.resources.result.SongListGetResult
import com.m4sango.sakaliveguide.domain.value.DiscTitle
import com.m4sango.sakaliveguide.domain.value.Groups
import org.springframework.stereotype.Service

@Service
class SongService(
        private val songRepository: SongRepository
) {
    fun getSongList(groups: Groups, discTitle: DiscTitle): SongListGetResult {
        return SongListGetResult.create(songRepository.getSongListByDiscTitle(groups, discTitle))
    }
}