package library.domain

class Library {
    private val books =
        listOf(
            Book(
                title = "Growing object-oriented software guided by tests",
                author = "Nat Pryce and Steve Freeman",
                copies = 4
            ),
            Book(
                title = "Test-driven Development: By example",
                author = "Kent Beck",
                copies = 3
            )
        )

    fun listBooks(): List<Book> = books
}
