package com.m4sango.sakaliveguide.application.resource.response

import com.m4sango.sakaliveguide.domain.value.Likes

data class SongColorGetLikesResponse(
        val likes: Int
) {
    companion object Factory {
        fun create(likes: Likes): SongColorGetLikesResponse {
            return SongColorGetLikesResponse(likes.value)
        }
    }
}