package com.exercise.kotlin.domain.book

class Author(private val name: String) {

    override fun equals(other: Any?): Boolean {
        if (other !is Author) {
            return false
        }
        val inputObj: Author = other as Author
        return inputObj::name == this::name
    }

    override fun hashCode(): Int {
        return this::name.hashCode()
    }
}