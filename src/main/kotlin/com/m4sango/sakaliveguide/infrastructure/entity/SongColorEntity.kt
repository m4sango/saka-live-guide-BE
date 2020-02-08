package com.m4sango.sakaliveguide.infrastructure.entity

data class SongColorEntity(
        val songColorId: Int,
        val userId: String,
        val songName: String,
        val penColor1: Int,
        val penColor2: Int)