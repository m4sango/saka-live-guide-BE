package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.value.Likes
import com.m4sango.sakaliveguide.domain.value.SongColorId

interface SongColorLikesRepository {
    fun countLike(songColorId: SongColorId): Likes
}