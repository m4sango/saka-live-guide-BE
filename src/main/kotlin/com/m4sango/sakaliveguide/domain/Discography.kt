package com.m4sango.sakaliveguide.domain

import com.m4sango.sakaliveguide.domain.value.DiscForm
import com.m4sango.sakaliveguide.domain.value.DiscOrder
import com.m4sango.sakaliveguide.domain.value.DiscTitle
import com.m4sango.sakaliveguide.infrastructure.repository.entity.DiscographyEntity

data class Discography(
        val discOrder: DiscOrder,
        val discForm: DiscForm,
        val discTitle: DiscTitle
) {
    companion object {
        fun create(entity: DiscographyEntity): Discography {
            return Discography(
                    DiscOrder(entity.order),
                    DiscForm(entity.form),
                    DiscTitle(entity.title))
        }
    }
}