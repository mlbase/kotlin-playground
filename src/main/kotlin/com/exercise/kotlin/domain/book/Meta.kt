package com.exercise.kotlin.domain.book

import java.util.Date

class Meta(private val isbn: String, private val publishDate: Date, private val price: Price){

    private var context: String? = null


    fun insertContext(input: String) {
        this.context = input
    }

    fun getContext(): String {
        return this.context?: ""
    }

    override fun equals(other: Any?): Boolean {
        if( other == this) return true
        if( other !is Meta) {
            return false
        }
        val inputObj: Meta = other as Meta
        return inputObj.isbn == isbn
    }

    override fun hashCode(): Int {
        return isbn.hashCode()
    }
}