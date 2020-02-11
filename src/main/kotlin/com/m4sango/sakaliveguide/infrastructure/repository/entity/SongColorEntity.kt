package com.m4sango.sakaliveguide.infrastructure.repository.entity

import com.m4sango.sakaliveguide.domain.SongColor

data class SongColorEntity(
        val songColorId: Int,
        val userId: String,
        val songName: String,
        val penColor1: String,
        val penColor2: String
) {
    companion object {
        fun createForRegister(target: SongColor): SongColorEntity {
            return SongColorEntity(
                    0,
                    target.userId.value,
                    target.songName.value,
                    target.penColor1.value,
                    target.penColor1.value)
        }
    }
}