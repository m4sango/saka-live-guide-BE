package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.value.Likes
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.UserId

interface SongColorLikesRepository {
    fun countLike(songColorId: SongColorId): Likes

    fun register(songColorId: SongColorId, userId: UserId)
}