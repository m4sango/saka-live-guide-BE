package com.m4sango.sakaliveguidebe.domain.service.resources.result

import com.m4sango.sakaliveguidebe.domain.Song
import com.m4sango.sakaliveguidebe.domain.value.DiscTitle

class SongListGetResult(
        val songListMap: Map<DiscTitle, List<Song>>
) {
    companion object {
        fun create(songListMap: Map<DiscTitle, List<Song>>): SongListGetResult {
            return SongListGetResult(songListMap)
        }
    }
}