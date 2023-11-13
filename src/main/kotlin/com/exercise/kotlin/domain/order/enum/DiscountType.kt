package com.exercise.kotlin.domain.order.enum

enum class DiscountType(val isMultiple: Boolean, val isExpirable: Boolean) {
    REGISTER_PROMOTION(false, false),
    MULTIPLE_PROMOTION(true, true),
    ANNIVERSARY_PROMOTION_ONLY_ONE(false, true),
    ANNIVERSARY_PROMOTION_MULTIPLE(true, true),
    EMERGENCY_PROMOTION_ONLY_ONE(false, true),
    EMERGENCY_PROMOTION_MULTIPLE(true, true)
}