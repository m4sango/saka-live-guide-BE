package com.m4sango.sakaliveguidebe.application.controller

import com.m4sango.sakaliveguidebe.application.resources.request.SongColorsLikesRegisterRequest
import com.m4sango.sakaliveguidebe.application.resources.request.SongColorsRegisterRequest
import com.m4sango.sakaliveguidebe.application.resources.response.SongColorLikesGetResponse
import com.m4sango.sakaliveguidebe.application.resources.response.SongColorListGetResponse
import com.m4sango.sakaliveguidebe.domain.SongColor
import com.m4sango.sakaliveguidebe.domain.service.SongColorService
import com.m4sango.sakaliveguidebe.domain.value.SongColorId
import com.m4sango.sakaliveguidebe.domain.value.SongName
import com.m4sango.sakaliveguidebe.domain.value.UserId
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/songs/{songName}/colors", produces = [MediaType.APPLICATION_JSON_VALUE])
class SongColorController(private val songColorService: SongColorService) {

    @GetMapping
    fun getList(
            @PathParam("songName") songName: String
    ): SongColorListGetResponse {
        return SongColorListGetResponse.create(songColorService.getSongColorList(SongName(songName)))
    }

    @PostMapping
    fun register(
            @PathParam("songName") songName: String,
            @RequestBody request: SongColorsRegisterRequest
    ): ResponseEntity<Any> {

        songColorService.register(SongColor.createForRegister(request, songName))

        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping("/{songColorId}/likes")
    fun getLikes(
            @PathVariable("songColorId") songColorId: Int
    ): SongColorLikesGetResponse {
        return SongColorLikesGetResponse.create(songColorService.getLikes(SongColorId(songColorId)))
    }

    @PostMapping("/{songColorId}/likes")
    fun register(
            @PathVariable("songColorId") songColorId: Int,
            @RequestBody request: SongColorsLikesRegisterRequest
    ): ResponseEntity<Any> {
        songColorService.register(SongColorId(songColorId), UserId(request.userId))

        return ResponseEntity(HttpStatus.CREATED)
    }
}