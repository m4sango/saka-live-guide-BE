package com.m4sango.sakaliveguide.domain.value

enum class Groups(val value: String) {
    NOGIZAKA("nogizaka"),
    KEYAKIZAKA("keyakizaka"),
    HINATAZAKA("hinatazaka"),
    ;

    companion object {
        fun of(value: String): Groups {
            return Groups.values().firstOrNull { it.value == value }
                    ?: throw IllegalArgumentException("illegal value of enums")
        }
    }
}