package com.m4sango.sakaliveguide.infrastructure.repository.entity

data class SongListEntity(
        val songMap: Map<String, List<SongEntity>>
)