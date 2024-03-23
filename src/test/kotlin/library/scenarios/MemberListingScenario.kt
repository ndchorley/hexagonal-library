package library.scenarios

import library.actors.Member
import library.domain.Book
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

interface MemberListingScenario {
    val member: Member

    @Test
    fun `a member can list books to borrow`() {
        val books = member.listBooks()

        expectThat(books)
            .isEqualTo(
                listOf(
                    Book(
                        title = "Test-driven Development: By example",
                        author = "Kent Beck",
                        copies = 3
                    )
                )
            )
    }
}
