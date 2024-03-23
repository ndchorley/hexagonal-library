package library.actors

import library.Book

interface Member {
    fun listBooks(): List<Book>
}
