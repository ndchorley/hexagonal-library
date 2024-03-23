package library

class Library {
    private val books =
        listOf(
            Book(
                title = "Test-driven Development: By example",
                author = "Kent Beck",
                copies = 3
            )
        )

    fun listBooks(): List<Book> = books
}
