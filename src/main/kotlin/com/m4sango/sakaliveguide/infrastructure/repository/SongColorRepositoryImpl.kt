package com.m4sango.sakaliveguide.infrastructure.repository

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import com.m4sango.sakaliveguide.domain.value.Count
import com.m4sango.sakaliveguide.domain.value.PenColor
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.infrastructure.repository.entity.SongColorEntity
import com.m4sango.sakaliveguide.infrastructure.repository.mapper.SongColorListMapper
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class SongColorRepositoryImpl(
        private val songColorListMapper: SongColorListMapper
) : SongColorRepository {
    override fun getSongColorList(songName: SongName): List<SongColor> {
        val songColorList = songColorListMapper.findBySongName(songName.value)
        return songColorList.stream()
                .map { SongColor.create(it) }
                .collect(Collectors.toList())
    }

    override fun countSame(songName: SongName, penColor1: PenColor, penColor2: PenColor): Count {
        val count = songColorListMapper.countSame(songName.value, penColor1.value, penColor2.value)
        return Count(count)
    }

    override fun register(songColor: SongColor) {
        songColorListMapper.insert(SongColorEntity.createForRegister(songColor))
    }
}