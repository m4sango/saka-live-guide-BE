package com.m4sango.sakaliveguide.domain.service.resources.result

import com.m4sango.sakaliveguide.domain.value.Likes

data class LikesGetResult(
        val likes: Likes
) {
    companion object {
        fun create(likes: Likes): LikesGetResult {
            return LikesGetResult(likes)
        }
    }
}