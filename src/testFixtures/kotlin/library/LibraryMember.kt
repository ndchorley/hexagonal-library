package library

import library.actors.Member
import library.domain.Book
import library.domain.Library

class LibraryMember(private val library: Library) : Member {
    override fun listBooks(): List<Book> = library.listBooks()
}
