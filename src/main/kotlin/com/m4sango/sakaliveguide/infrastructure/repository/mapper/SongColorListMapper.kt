package com.m4sango.sakaliveguide.infrastructure.repository.mapper

import com.m4sango.sakaliveguide.infrastructure.repository.entity.SongColorEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface SongColorListMapper {

    fun findBySongName(@Param("songName") songName: String): List<SongColorEntity>

    fun countSame(
            @Param("songName") songName: String,
            @Param("penColor1") penColor1: String,
            @Param("penColor2") penColor2: String
    ): Int

    fun insert(entity: SongColorEntity)
}