package com.m4sango.sakaliveguidebe.domain.repository

import com.m4sango.sakaliveguidebe.domain.value.Likes
import com.m4sango.sakaliveguidebe.domain.value.SongColorId
import com.m4sango.sakaliveguidebe.domain.value.UserId

interface SongColorLikesRepository {
    fun countLike(songColorId: SongColorId): Likes

    fun register(songColorId: SongColorId, userId: UserId)
}