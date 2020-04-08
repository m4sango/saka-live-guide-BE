package com.m4sango.sakaliveguidebe.domain.exception

class ApplicationException(cause: Throwable? = null, errorCode: ErrorCode) : BaseException(cause, errorCode) {
}