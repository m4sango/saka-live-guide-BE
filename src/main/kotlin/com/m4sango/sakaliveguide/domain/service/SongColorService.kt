package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.repository.SongColorLikesRepository
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import com.m4sango.sakaliveguide.domain.value.Likes
import com.m4sango.sakaliveguide.domain.value.SongColorId
import org.springframework.stereotype.Service

@Service
class SongColorService(
        private val songColorRepository: SongColorRepository,
        private val songColorLikesRepository: SongColorLikesRepository
) {
    fun getSongColorList(): List<SongColor> {
        return songColorRepository.getSongColorList()
    }

    fun getLikes(songColorId: SongColorId): Likes {
        return songColorLikesRepository.countLike(songColorId)
    }
}