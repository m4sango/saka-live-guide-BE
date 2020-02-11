package com.m4sango.sakaliveguide.application.resource.request

data class SongColorsRegisterRequest(
        val userId: String,
        val songName: String,
        val penColor1: String,
        val penColor2: String)