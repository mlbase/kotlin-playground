package com.exercise.kotlin.domain.book

class Genre (private val genreNumber: Number,private val genreName: String){

    override fun equals(other: Any?): Boolean {
        if (other !is Genre) {
            return false
        }
        val inputObj: Genre = other as Genre
        if(inputObj.genreNumber != genreNumber) {
            return false
        }

        if( inputObj.genreName != genreName) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        return genreNumber.hashCode()
    }
}