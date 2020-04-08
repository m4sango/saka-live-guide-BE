package com.m4sango.sakaliveguidebe.application.resources.response

import com.m4sango.sakaliveguidebe.domain.service.resources.result.LikesGetResult

data class SongColorLikesGetResponse(
        val likes: Int
) {
    companion object Factory {
        fun create(result: LikesGetResult): SongColorLikesGetResponse {
            return SongColorLikesGetResponse(result.likes.value)
        }
    }
}