package com.exercise.kotlin.domain.book.enum

enum class Currency(val unit: String, val rate: Double) {
    WON("원", 1.0),
    Dollar("dollar", 0.00761),
    Yen("Yen", 0.051491)
}