package com.sakethh.linkora.utils

import com.sakethh.linkora.domain.model.WebSocketEvent
import io.ktor.http.*

sealed class Result<T> {
    data class Success<T>(val response: T, val webSocketEvent: WebSocketEvent? = null) : Result<T>()
    data class Failure<T>(
        val exception: Exception,
        val httpStatusCode: HttpStatusCode = HttpStatusCode.InternalServerError
    ) : Result<T>()
}