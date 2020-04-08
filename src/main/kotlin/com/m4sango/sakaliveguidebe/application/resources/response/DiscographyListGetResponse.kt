package com.m4sango.sakaliveguidebe.application.resources.response

import com.m4sango.sakaliveguidebe.domain.service.resources.result.DiscographyListGetResult
import java.util.stream.Collectors

data class DiscographyListGetResponse(
        val discographyList: List<Discography>
) {
    companion object {
        fun create(result: DiscographyListGetResult): DiscographyListGetResponse {
            return DiscographyListGetResponse(
                    result.discographyList.stream()
                            .map { Discography.create(it) }
                            .collect(Collectors.toList()))
        }
    }
}