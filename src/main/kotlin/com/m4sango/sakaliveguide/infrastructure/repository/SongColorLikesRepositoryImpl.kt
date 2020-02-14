package com.m4sango.sakaliveguide.infrastructure.repository

import com.m4sango.sakaliveguide.domain.repository.SongColorLikesRepository
import com.m4sango.sakaliveguide.domain.value.Likes
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.UserId
import com.m4sango.sakaliveguide.infrastructure.repository.entity.SongColorLikesEntity
import com.m4sango.sakaliveguide.infrastructure.repository.mapper.SongColorLikesMapper
import org.springframework.stereotype.Component

@Component
class SongColorLikesRepositoryImpl(private val songColorLikesMapper: SongColorLikesMapper) : SongColorLikesRepository {

    override fun countLike(songColorId: SongColorId): Likes {
        return Likes(songColorLikesMapper.countBySongColorId(songColorId.value))
    }

    override fun register(songColorId: SongColorId, userId: UserId) {
        songColorLikesMapper.insert(SongColorLikesEntity.createForInsert(songColorId, userId))
    }
}