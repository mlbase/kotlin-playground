package com.exercise.kotlin.domain.order

import com.exercise.kotlin.domain.order.enum.DiscountType

class Discount(private val rate: Double, private val type: DiscountType) {
    private val isMultiple: Boolean = type.isMultiple
    private val isExpirable: Boolean = type.isExpirable
}