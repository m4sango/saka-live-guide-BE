package com.m4sango.sakaliveguide.domain.exception

class ApplicationException(cause: Throwable? = null, errorCode: ErrorCode) : BaseException(cause, errorCode) {
}