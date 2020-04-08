package com.m4sango.sakaliveguidebe.domain.value

// TODO: とりあえず乃木坂だけ
enum class PenColor(val value: String) {
    WHITE("white"),
    ORANGE("orange"),
    BLUE("blue"),
    YELLOW("yellow"),
    PURPLE("purple"),
    GREEN("green"),
    PINK("pink"),
    RED("red"),
    LIGHT_BLUE("light_blue"),
    YELLOW_GREEN("yellow_green"),
    TURQUOISE("turquoise"),
    // 公式には存在しない(かなりんのみ)
    BLACK("black"),
    // なし・決まっていない
    NONE("none"),
    ;

    companion object {
        fun of(value: String): PenColor {
            return values().firstOrNull { it.value == value } ?: NONE
        }
    }
}