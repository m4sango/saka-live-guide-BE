package com.m4sango.sakaliveguide.application.resources.response

import com.m4sango.sakaliveguide.domain.Discography as DiscographyDomain

data class Discography(
        val discOrder: String,
        val discForm: String,
        val discTitle: String
) {
    companion object {
        fun create(domain: DiscographyDomain): Discography {
            return Discography(domain.discOrder.value, domain.discForm.value, domain.discTitle.value)
        }
    }
}