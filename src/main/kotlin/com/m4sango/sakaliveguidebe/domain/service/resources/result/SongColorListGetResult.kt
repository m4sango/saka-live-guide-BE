package com.m4sango.sakaliveguidebe.domain.service.resources.result

import com.m4sango.sakaliveguidebe.domain.SongColor

data class SongColorListGetResult(
        val songColorList: List<SongColor>
) {
    companion object {
        fun create(songColorList: List<SongColor>): SongColorListGetResult {
            return SongColorListGetResult(songColorList);
        }
    }
}