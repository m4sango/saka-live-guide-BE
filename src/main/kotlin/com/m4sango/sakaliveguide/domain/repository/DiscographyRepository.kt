package com.m4sango.sakaliveguide.domain.repository

import com.m4sango.sakaliveguide.domain.Discography
import com.m4sango.sakaliveguide.domain.value.Groups

interface DiscographyRepository {

    fun getDiscographyList(groups: Groups): List<Discography>
}