package com.m4sango.sakaliveguide.application.resources.response

import com.m4sango.sakaliveguide.domain.value.Likes

data class SongColorLikesGetResponse(
        val likes: Int
) {
    companion object Factory {
        fun create(likes: Likes): SongColorLikesGetResponse {
            return SongColorLikesGetResponse(likes.value)
        }
    }
}