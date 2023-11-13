package com.exercise.kotlin.dto


data class FirstDto(val id: Int, val name: String) {
    data class FirstRequest(val id: Int)
    data class FirstResponse(val name: String)
}