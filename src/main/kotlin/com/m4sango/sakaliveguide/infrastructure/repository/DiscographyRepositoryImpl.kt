package com.m4sango.sakaliveguide.infrastructure.repository

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.m4sango.sakaliveguide.domain.Discography
import com.m4sango.sakaliveguide.domain.repository.DiscographyRepository
import com.m4sango.sakaliveguide.domain.value.Groups
import com.m4sango.sakaliveguide.infrastructure.repository.entity.DiscographyListEntity
import org.springframework.stereotype.Component
import java.io.File
import java.util.stream.Collectors

@Component
class DiscographyRepositoryImpl : DiscographyRepository {

    companion object {
        const val FILE_PATH_PREFIX = "./src/main/resources/static/"
        const val FILE_NAME_SUFFIX = "_discography.json"
        val OBJECT_MAPPER = jacksonObjectMapper()
    }

    override fun getDiscographyList(groups: Groups): List<Discography> {
        val jsonStr: String = File(buildJsonFilePath(groups)).readText(Charsets.UTF_8)

        val entity: DiscographyListEntity = OBJECT_MAPPER.readValue(jsonStr)

        return entity.discography.stream()
                .map { Discography.create(it) }
                .collect(Collectors.toList())
    }

    private fun buildJsonFilePath(groups: Groups): String {
        return FILE_PATH_PREFIX + groups.value + FILE_NAME_SUFFIX
    }
}