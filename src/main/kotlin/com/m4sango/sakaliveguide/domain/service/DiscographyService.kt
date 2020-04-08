package com.m4sango.sakaliveguide.domain.service

import com.m4sango.sakaliveguide.domain.repository.DiscographyRepository
import com.m4sango.sakaliveguide.domain.service.resources.result.DiscographyListGetResult
import com.m4sango.sakaliveguide.domain.value.Groups
import org.springframework.stereotype.Service

@Service
class DiscographyService(
        private val discographyRepository: DiscographyRepository
) {
    fun getDiscographyList(groups: Groups): DiscographyListGetResult {
        return DiscographyListGetResult.create(discographyRepository.getDiscographyList(groups))
    }
}