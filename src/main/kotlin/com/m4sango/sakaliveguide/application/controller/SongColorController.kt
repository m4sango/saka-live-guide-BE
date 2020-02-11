package com.m4sango.sakaliveguide.application.controller

import com.m4sango.sakaliveguide.application.resource.response.SongColorGetLikesResponse
import com.m4sango.sakaliveguide.application.resource.response.SongColorGetListResponse
import com.m4sango.sakaliveguide.domain.service.SongColorService
import com.m4sango.sakaliveguide.domain.value.SongColorId
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/song/color", produces = [MediaType.APPLICATION_JSON_VALUE])
class SongColorController(private val songColorService: SongColorService) {

    @GetMapping("/list")
    fun getList(): SongColorGetListResponse {
        return SongColorGetListResponse.create(songColorService.getSongColorList())
    }

    @GetMapping("/{songColorId}/likes")
    fun getLikes(
            @PathVariable("songColorId") songColorId: Int
    ): SongColorGetLikesResponse {
        return SongColorGetLikesResponse.create(songColorService.getLikes(SongColorId(songColorId)))
    }
}