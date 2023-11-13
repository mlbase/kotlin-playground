package com.exercise.kotlin.domain.book

class BookId(private val value:String) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is BookId) return false
        val inputObj: BookId = other as BookId
        return value == inputObj.value
    }

    override fun hashCode(): Int {
        return value.hashCode();
    }
}