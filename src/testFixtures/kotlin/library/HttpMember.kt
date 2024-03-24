package library

import library.actors.Member
import library.domain.Book
import org.http4k.core.HttpHandler
import org.http4k.webdriver.Http4kWebDriver
import org.openqa.selenium.By

interface HttpMember : Member {
    val baseUri: String
    val system: HttpHandler

    override fun listBooks(): List<Book> {
        val driver = Http4kWebDriver(system)

        driver.navigate().to("$baseUri/")

        val bookDivs =
            driver.findElements(By.className("book")) ?: return emptyList()

        return bookDivs.mapNotNull { div ->
            val title = div.findElement(By.className("title"))?.text
            val author = div.findElement(By.className("author"))?.text
            val copies = div.findElement(By.className("copies"))?.text?.toInt()

            when {
                title != null && author != null && copies != null ->
                    (Book(title, author, copies))

                else -> null
            }
        }
    }
}
