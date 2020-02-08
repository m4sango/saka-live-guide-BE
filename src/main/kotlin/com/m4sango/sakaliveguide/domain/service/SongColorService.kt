package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import org.springframework.stereotype.Service

@Service
class SongColorService(
        private val songColorRepository: SongColorRepository
) {
    fun getSongColorList(): List<SongColor> {
        return songColorRepository.getSongColorList()
    }
}