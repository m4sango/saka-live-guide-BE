package com.m4sango.sakaliveguidebe.infrastructure.repository.mapper

import com.m4sango.sakaliveguidebe.infrastructure.repository.entity.SongColorLikesEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface SongColorLikesMapper {

    fun countBySongColorId(@Param("songColorId") songColorId: Int): Int

    fun insert(entity: SongColorLikesEntity)
}