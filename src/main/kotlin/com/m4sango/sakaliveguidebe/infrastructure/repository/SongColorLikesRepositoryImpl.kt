package com.m4sango.sakaliveguidebe.infrastructure.repository

import com.m4sango.sakaliveguidebe.domain.repository.SongColorLikesRepository
import com.m4sango.sakaliveguidebe.domain.value.Likes
import com.m4sango.sakaliveguidebe.domain.value.SongColorId
import com.m4sango.sakaliveguidebe.domain.value.UserId
import com.m4sango.sakaliveguidebe.infrastructure.repository.entity.SongColorLikesEntity
import com.m4sango.sakaliveguidebe.infrastructure.repository.mapper.SongColorLikesMapper
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