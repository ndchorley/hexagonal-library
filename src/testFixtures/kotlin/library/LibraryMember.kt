package library

import library.actors.Member

class LibraryMember(private val library: Library) : Member {
    override fun listBooks(): List<Book> = library.listBooks()
}
