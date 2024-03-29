package com.m4sango.sakaliveguidebe.application.controller

import com.m4sango.sakaliveguidebe.application.resources.response.SongListGetResponse
import com.m4sango.sakaliveguidebe.domain.service.SongService
import com.m4sango.sakaliveguidebe.domain.value.DiscTitle
import com.m4sango.sakaliveguidebe.domain.value.Groups
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/songs", produces = [MediaType.APPLICATION_JSON_VALUE])
class SongController(
        private val songService: SongService
) {

    @GetMapping
    fun getList(
            @RequestParam("group") group: String,
            @RequestParam("discTitle") discTitle: String
    ): SongListGetResponse {
        return SongListGetResponse.create(songService.getSongList(Groups.of(group), DiscTitle(discTitle)))
    }
}