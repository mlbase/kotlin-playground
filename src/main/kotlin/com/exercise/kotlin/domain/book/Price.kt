package com.exercise.kotlin.domain.book

import com.exercise.kotlin.domain.book.enum.Currency


class Price(private val number: Number, private val currency: Currency) {

    fun convertTo(targetCurrency: Currency): Double {
        if (currency == targetCurrency) {
            return number.toDouble()
        }
        return number.toDouble() / currency.rate * targetCurrency.rate
    }

    override fun equals(other: Any?): Boolean {
        if (other == this) {
            return true
        }
        if(other !is Price) {
            return false
        }
        val inputObj: Price = other as Price
        return inputObj.number == this.number && inputObj.currency == this.currency
    }

    override fun hashCode(): Int {
        return currency.hashCode().and(number.hashCode())
    }
}