package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.exception.ApplicationException
import com.m4sango.sakaliveguide.domain.exception.ErrorCode
import com.m4sango.sakaliveguide.domain.repository.SongColorLikesRepository
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import com.m4sango.sakaliveguide.domain.value.Likes
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import org.springframework.stereotype.Service

@Service
class SongColorService(
        private val songColorRepository: SongColorRepository,
        private val songColorLikesRepository: SongColorLikesRepository
) {
    fun getSongColorList(songName: SongName): List<SongColor> {
        return songColorRepository.getSongColorList(songName)
    }

    fun getLikes(songColorId: SongColorId): Likes {
        return songColorLikesRepository.countLike(songColorId)
    }

    fun register(
            songColor: SongColor
    ) {
        val count = songColorRepository
                .countSame(songColor.songName, songColor.penColor1, songColor.penColor2)

        if (count.isExists()) {
            throw ApplicationException(errorCode = ErrorCode.EXISTS_SAME_DATA)
        }
        
        songColorRepository.register(songColor)
    }
}