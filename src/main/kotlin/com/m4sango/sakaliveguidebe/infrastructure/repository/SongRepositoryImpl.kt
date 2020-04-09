package com.m4sango.sakaliveguidebe.infrastructure.repository

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.m4sango.sakaliveguidebe.domain.Song
import com.m4sango.sakaliveguidebe.domain.SongDetail
import com.m4sango.sakaliveguidebe.domain.repository.SongRepository
import com.m4sango.sakaliveguidebe.domain.value.DiscTitle
import com.m4sango.sakaliveguidebe.domain.value.Groups
import com.m4sango.sakaliveguidebe.domain.value.SongName
import com.m4sango.sakaliveguidebe.infrastructure.repository.entity.SongListEntity
import com.m4sango.sakaliveguidebe.infrastructure.repository.utils.FileUtils
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class SongRepositoryImpl : SongRepository {

    companion object {
        private const val FILE_PATH_PREFIX = "./src/main/resources/static/"
        private const val FILE_NAME_SUFFIX = "_song_list.json"
        private val OBJECT_MAPPER = jacksonObjectMapper()
    }

    override fun getSong(songName: SongName, groups: Groups): SongDetail {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllSongList(groups: Groups): List<Song> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSongListByDiscTitle(groups: Groups, discTitle: DiscTitle): Map<DiscTitle, List<Song>> {
        val jsonStr: String = FileUtils.getResourceFileAsString(buildJsonFilePath(groups))

        val entity: SongListEntity = OBJECT_MAPPER.readValue(jsonStr)

        return entity.songMap
                .mapKeys { DiscTitle(it.key) }
                .filter { it.key == discTitle }
                .mapValues { map ->
                    map.value.stream()
                            .map { Song.create(it) }
                            .collect(Collectors.toList())
                }
    }

    private fun buildJsonFilePath(groups: Groups): String {
        return FILE_PATH_PREFIX + groups.value + FILE_NAME_SUFFIX
    }
}