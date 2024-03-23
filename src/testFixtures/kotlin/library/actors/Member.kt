package library.actors

import library.domain.Book

interface Member {
    fun listBooks(): List<Book>
}
