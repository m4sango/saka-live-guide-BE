package com.m4sango.sakaliveguidebe.application.controller

import com.m4sango.sakaliveguidebe.application.resources.response.DiscographyListGetResponse
import com.m4sango.sakaliveguidebe.domain.service.DiscographyService
import com.m4sango.sakaliveguidebe.domain.value.Groups
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/discs", produces = [MediaType.APPLICATION_JSON_VALUE])
class DiscographyController(
        private val discographyService: DiscographyService
) {
    @GetMapping
    fun getList(
            @RequestParam("group") group: String
    ): DiscographyListGetResponse {
        return DiscographyListGetResponse.create(discographyService.getDiscographyList(Groups.of(group)))
    }
}