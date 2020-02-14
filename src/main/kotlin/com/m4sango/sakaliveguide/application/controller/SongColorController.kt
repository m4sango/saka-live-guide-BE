package com.m4sango.sakaliveguide.application.controller

import com.m4sango.sakaliveguide.application.resource.request.SongColorsLikesRegisterRequest
import com.m4sango.sakaliveguide.application.resource.request.SongColorsRegisterRequest
import com.m4sango.sakaliveguide.application.resource.response.SongColorsGetLikesResponse
import com.m4sango.sakaliveguide.application.resource.response.SongColorsGetListResponse
import com.m4sango.sakaliveguide.domain.SongColor
import com.m4sango.sakaliveguide.domain.service.SongColorService
import com.m4sango.sakaliveguide.domain.value.SongColorId
import com.m4sango.sakaliveguide.domain.value.SongName
import com.m4sango.sakaliveguide.domain.value.UserId
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/song/colors", produces = [MediaType.APPLICATION_JSON_VALUE])
class SongColorController(private val songColorService: SongColorService) {

    @GetMapping
    fun getList(
            @RequestParam("songName") songName: String
    ): SongColorsGetListResponse {
        return SongColorsGetListResponse.create(songColorService.getSongColorList(SongName(songName)))
    }

    @GetMapping("/{songColorId}/likes")
    fun getLikes(
            @PathVariable("songColorId") songColorId: Int
    ): SongColorsGetLikesResponse {
        return SongColorsGetLikesResponse.create(songColorService.getLikes(SongColorId(songColorId)))
    }

    @PostMapping("/{songColorId}/likes")
    fun register(
            @PathVariable("songColorId") songColorId: Int,
            @RequestBody request: SongColorsLikesRegisterRequest
    ): ResponseEntity<Any> {
        songColorService.register(SongColorId(songColorId), UserId(request.userId))

        return ResponseEntity(HttpStatus.CREATED)
    }

    @PostMapping
    fun register(
            @RequestBody request: SongColorsRegisterRequest
    ): ResponseEntity<Any> {

        songColorService.register(SongColor.createForRegister(request))

        return ResponseEntity(HttpStatus.CREATED)
    }
}