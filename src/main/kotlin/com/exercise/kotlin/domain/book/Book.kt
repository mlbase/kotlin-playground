package com.exercise.kotlin.domain.book

import com.exercise.kotlin.domain.book.enum.SellingStatus

class Book(private val bookId: BookId, private val genre: Genre, private val meta: Meta,
           private val publisher: PublishingCompany, private val author: Author) {

    private var bookStatus: SellingStatus = SellingStatus.PREPARING
    private var inventory: Int = 0

    fun inventoryInbound(inboundQuantity: Int) {
        this.inventory += inboundQuantity
        if(this.bookStatus != SellingStatus.SELLING) {
            this.bookStatus = SellingStatus.SELLING
        }
    }

    fun discontinueSelling() {
        this.bookStatus = SellingStatus.INBOUND_DISCONTINUE
    }


}