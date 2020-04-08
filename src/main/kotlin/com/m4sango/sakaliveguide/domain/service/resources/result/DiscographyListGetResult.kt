package com.m4sango.sakaliveguide.domain.service.resources.result

import com.m4sango.sakaliveguide.domain.Discography

data class DiscographyListGetResult(
        val discographyList: List<Discography>
) {
    companion object {
        fun create(discographyList: List<Discography>): DiscographyListGetResult {
            return DiscographyListGetResult(discographyList)
        }
    }
}