package com.m4sango.sakaliveguidebe.domain.exception

enum class ErrorCode(val value: String) {
    /**
     * 1000:
     * 入力値不正
     */
    ALREADY_LIKES("1100"),

    /**
     * 2000:
     * データ未存在
     */

    /**
     * 3000:
     * データ状態不正
     */
    EXISTS_SAME_DATA("3100"),
    ;
}