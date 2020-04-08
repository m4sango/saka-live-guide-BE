package com.m4sango.sakaliveguidebe.domain.repository

import com.m4sango.sakaliveguidebe.domain.Discography
import com.m4sango.sakaliveguidebe.domain.value.Groups

interface DiscographyRepository {

    fun getDiscographyList(groups: Groups): List<Discography>
}