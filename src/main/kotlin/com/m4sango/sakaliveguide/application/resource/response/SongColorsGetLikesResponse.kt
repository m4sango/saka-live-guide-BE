package com.m4sango.sakaliveguide.application.resource.response

import com.m4sango.sakaliveguide.domain.value.Likes

data class SongColorsGetLikesResponse(
        val likes: Int
) {
    companion object Factory {
        fun create(likes: Likes): SongColorsGetLikesResponse {
            return SongColorsGetLikesResponse(likes.value)
        }
    }
}