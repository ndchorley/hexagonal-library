package library

import org.http4k.core.HttpHandler
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.template.HandlebarsTemplates
import org.http4k.template.ViewModel

class LibrarySystem(private val library: Library) : HttpHandler {
    override fun invoke(request: Request): Response {
        val books = library.listBooks()

        val body = renderer(ListBooksViewModel(books))
        return Response(Status.OK).body(body)
    }

    private val renderer = HandlebarsTemplates().CachingClasspath()

}

data class ListBooksViewModel(val books: List<Book>) : ViewModel