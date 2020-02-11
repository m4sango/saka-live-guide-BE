package com.m4sango.sakaliveguide.infrastructure.repository.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface SongColorLikesMapper {

    fun countBySongColorId(@Param("songColorId") songColorId: Int): Int
}