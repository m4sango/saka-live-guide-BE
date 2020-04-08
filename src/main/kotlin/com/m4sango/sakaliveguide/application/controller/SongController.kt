package com.m4sango.sakaliveguide.application.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/songs", produces = [MediaType.APPLICATION_JSON_VALUE])
class SongController {
}