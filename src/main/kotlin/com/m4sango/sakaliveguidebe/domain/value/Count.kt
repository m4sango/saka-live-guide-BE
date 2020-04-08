package com.m4sango.sakaliveguidebe.domain.value

data class Count(val value: Int) {
    fun isExists(): Boolean {
        return value != 0
    }
}