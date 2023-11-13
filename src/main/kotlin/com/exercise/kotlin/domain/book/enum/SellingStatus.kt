package com.exercise.kotlin.domain.book.enum

enum class SellingStatus(private val status: String) {
    PREPARING("준비중"),
    SELLING("판매중"),
    INBOUND_AWAITING("입고 대기중"),
    INBOUND_SUSPENSION("입고 중단"),
    INBOUND_DISCONTINUE("입고 정지")
}