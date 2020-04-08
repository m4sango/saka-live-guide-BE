package com.m4sango.sakaliveguide.domain.service.resources.result

import com.m4sango.sakaliveguide.domain.SongColor

data class SongColorListGetResult(
        val songColorList: List<SongColor>
) {
    companion object {
        fun create(songColorList: List<SongColor>): SongColorListGetResult {
            return SongColorListGetResult(songColorList);
        }
    }
}