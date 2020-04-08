package com.m4sango.sakaliveguidebe.domain.exception

abstract class BaseException(cause: Throwable? = null, private val errorCode: ErrorCode) : RuntimeException(cause) {
}