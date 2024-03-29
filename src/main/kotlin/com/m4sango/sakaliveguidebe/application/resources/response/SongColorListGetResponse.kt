package com.m4sango.sakaliveguidebe.application.resources.response

import com.m4sango.sakaliveguidebe.domain.service.resources.result.SongColorListGetResult
import java.util.stream.Collectors

data class SongColorListGetResponse(val songColorList: List<SongColor>) {
    companion object Factory {
        fun create(result: SongColorListGetResult): SongColorListGetResponse {

            val songColorList = result.songColorList.stream()
                    .map { value -> SongColor.create(value) }
                    .collect(Collectors.toList())

            return SongColorListGetResponse(songColorList)
        }
    }
}