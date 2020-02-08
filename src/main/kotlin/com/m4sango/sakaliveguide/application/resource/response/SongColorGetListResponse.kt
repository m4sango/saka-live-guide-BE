package com.m4sango.sakaliveguide.application.resource.response

import java.util.stream.Collectors
import com.m4sango.sakaliveguide.domain.SongColor as SongColorDomain

data class SongColorGetListResponse(val songColorList: List<SongColor>) {
    companion object Factory {
        fun create(domainList: List<SongColorDomain>): SongColorGetListResponse {

            val songColorList = domainList.stream()
                    .map { value -> SongColor.create(value) }
                    .collect(Collectors.toList())

            return SongColorGetListResponse(songColorList)
        }
    }
}