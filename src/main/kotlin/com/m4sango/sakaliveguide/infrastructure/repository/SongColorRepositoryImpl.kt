package com.m4sango.sakaliveguide.infrastructure.repository

import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.repository.SongColorRepository
import com.m4sango.sakaliveguide.domain.value.PenColor
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.domain.value.UserId
import org.springframework.stereotype.Component

@Component
class SongColorRepositoryImpl : SongColorRepository {
    override fun getSongColorList(): List<SongColor> {
        val songColor = SongColor(
                SongColorId(1),
                UserId("123"),
                SongName("君の名は希望"),
                PenColor.PURPLE,
                PenColor.PURPLE)
        return listOf(songColor)
    }
}