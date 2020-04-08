package com.m4sango.sakaliveguidebe.infrastructure.repository.entity

import com.m4sango.sakaliveguidebe.domain.value.SongColorId
import com.m4sango.sakaliveguidebe.domain.value.UserId

data class SongColorLikesEntity(
        val songColorId: Int,
        val userId: String
) {
    companion object {
        fun createForInsert(
                songColorId: SongColorId,
                userId: UserId
        ): SongColorLikesEntity {
            return SongColorLikesEntity(
                    songColorId.value,
                    userId.value
            );
        }
    }
}