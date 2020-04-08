package com.m4sango.sakaliveguidebe.application.resources.response

import com.m4sango.sakaliveguidebe.domain.SongColor as SongColorDomain

data class SongColor(
        val songColorId: Int,
        val userId: String,
        val songName: String,
        val penColor1: String,
        val penColor2: String
) {
    companion object Factory {
        fun create(domain: SongColorDomain): SongColor {
            return SongColor(
                    domain.songColorId.value,
                    domain.userId.value,
                    domain.songName.value,
                    domain.penColor1.value,
                    domain.penColor2.value)
        }
    }
}