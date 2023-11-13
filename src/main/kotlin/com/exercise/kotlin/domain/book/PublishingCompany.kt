package com.exercise.kotlin.domain.book

class PublishingCompany(private val businessNumber: Int,private val companyName: String) {

    override fun equals(other: Any?): Boolean {
        if(other == this) {
            return true
        }
        if(other !is PublishingCompany) {
            return false
        }

        if(other.businessNumber != businessNumber) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        return businessNumber.hashCode()
    }
}