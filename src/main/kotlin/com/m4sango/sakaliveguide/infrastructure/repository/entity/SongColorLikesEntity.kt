package com.m4sango.sakaliveguide.infrastructure.repository.entity

import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.UserId

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