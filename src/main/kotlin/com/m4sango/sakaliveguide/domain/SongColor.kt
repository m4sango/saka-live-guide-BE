package com.m4sango.sakaliveguide.domain

import com.m4sango.sakaliveguide.application.resources.request.SongColorsRegisterRequest
import com.m4sango.sakaliveguide.domain.value.PenColor
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.domain.value.UserId
import com.m4sango.sakaliveguide.infrastructure.repository.entity.SongColorEntity

data class SongColor(
        val songColorId: SongColorId,
        val userId: UserId,
        val songName: SongName,
        val penColor1: PenColor,
        val penColor2: PenColor
) {
    companion object {
        fun create(entity: SongColorEntity): SongColor {
            return SongColor(
                    SongColorId(entity.songColorId),
                    UserId(entity.userId),
                    SongName(entity.songName),
                    PenColor.of(entity.penColor1),
                    PenColor.of(entity.penColor2))
        }

        fun createForRegister(request: SongColorsRegisterRequest, songName: String): SongColor {
            return SongColor(
                    SongColorId(0),
                    UserId(request.userId),
                    SongName(songName),
                    PenColor.of(request.penColor1),
                    PenColor.of(request.penColor2))
        }
    }
}
