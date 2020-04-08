package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.exception.ApplicationException
import com.m4sango.sakaliveguide.domain.exception.ErrorCode
import com.m4sango.sakaliveguide.domain.repository.SongColorLikesRepository
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import com.m4sango.sakaliveguide.domain.service.resources.result.LikesGetResult
import com.m4sango.sakaliveguide.domain.service.resources.result.SongColorListGetResult
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.domain.value.UserId
import org.springframework.dao.DuplicateKeyException
import org.springframework.stereotype.Service

@Service
class SongColorService(
        private val songColorRepository: SongColorRepository,
        private val songColorLikesRepository: SongColorLikesRepository
) {
    fun getSongColorList(songName: SongName): SongColorListGetResult {
        return SongColorListGetResult.create(songColorRepository.getSongColorList(songName))
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

    fun getLikes(songColorId: SongColorId): LikesGetResult {
        return LikesGetResult.create(songColorLikesRepository.countLike(songColorId))
    }

    fun register(
            songColorId: SongColorId,
            userId: UserId
    ) {
        try {
            songColorLikesRepository.register(songColorId, userId)
        } catch (ex: DuplicateKeyException) {
            throw ApplicationException(ex, ErrorCode.ALREADY_LIKES)
        }
    }
}