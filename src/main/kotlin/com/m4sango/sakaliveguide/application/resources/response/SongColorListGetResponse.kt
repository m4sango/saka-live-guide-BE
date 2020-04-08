package com.m4sango.sakaliveguide.application.resources.response

import java.util.stream.Collectors
import com.m4sango.sakaliveguide.domain.SongColor as SongColorDomain

data class SongColorListGetResponse(val songColorList: List<SongColor>) {
    companion object Factory {
        fun create(domainList: List<SongColorDomain>): SongColorListGetResponse {

            val songColorList = domainList.stream()
                    .map { value -> SongColor.create(value) }
                    .collect(Collectors.toList())

            return SongColorListGetResponse(songColorList)
        }
    }
}