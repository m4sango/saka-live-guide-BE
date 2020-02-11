package com.m4sango.sakaliveguide.domain.exception

abstract class BaseException(cause: Throwable? = null, private val errorCode: ErrorCode) : RuntimeException(cause) {
}