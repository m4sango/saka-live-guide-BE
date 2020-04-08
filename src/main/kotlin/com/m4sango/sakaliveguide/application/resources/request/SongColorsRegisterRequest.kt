package com.m4sango.sakaliveguide.application.resources.request

data class SongColorsRegisterRequest(
        val userId: String,
        val penColor1: String,
        val penColor2: String)