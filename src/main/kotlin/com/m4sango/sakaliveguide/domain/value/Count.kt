package com.m4sango.sakaliveguide.domain.value

data class Count(val value: Int) {
    fun isExists(): Boolean {
        return value != 0
    }
}