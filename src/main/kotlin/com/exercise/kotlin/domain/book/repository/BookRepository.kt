package com.exercise.kotlin.domain.book.repository

import com.exercise.kotlin.domain.book.Author
import com.exercise.kotlin.domain.book.Book
import com.exercise.kotlin.domain.book.BookId
import com.exercise.kotlin.domain.book.PublishingCompany

interface BookRepository {
    fun findById(bookId: BookId): Book
    fun findByAuthor(author: Author): Book
    fun findByPublisher(publisher: PublishingCompany)

    fun getInventory()

}