package library

import library.actors.Member
import org.http4k.core.HttpHandler
import org.http4k.webdriver.Http4kWebDriver
import org.openqa.selenium.By

interface HttpMember : Member {
    val system: HttpHandler

    override fun listBooks(): List<Book> {
        val driver = Http4kWebDriver(system)

        driver.navigate().to("/")

        val bookDiv = driver.findElement(By.id("book"))

        val title = bookDiv?.findElement(By.id("title"))?.text
        val author = bookDiv?.findElement(By.id("author"))?.text
        val copies = bookDiv?.findElement(By.id("copies"))?.text?.toInt()

        return when {
            title != null && author != null && copies != null -> listOf(Book(title, author, copies))
            else -> emptyList()
        }
    }
}
