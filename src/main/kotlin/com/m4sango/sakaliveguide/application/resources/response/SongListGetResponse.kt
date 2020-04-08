package com.m4sango.sakaliveguide.application.resources.response

import com.m4sango.sakaliveguide.domain.service.resources.result.SongListGetResult
import java.util.stream.Collectors

data class SongListGetResponse(
        val songList: Map<String, List<Song>>
) {
    companion object {
        fun create(result: SongListGetResult): SongListGetResponse {
            return SongListGetResponse(
                    result.songListMap
                            .mapKeys { it.key.value }
                            .mapValues { map ->
                                map.value.stream()
                                        .map { Song.create(it) }
                                        .collect(Collectors.toList())
                            })
        }
    }
}