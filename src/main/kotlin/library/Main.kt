package library

import library.domain.Library
import org.http4k.server.Jetty
import org.http4k.server.asServer

fun createServer(port: Int) = LibrarySystem(Library()).asServer(Jetty(port))

fun main() {
    createServer(9000).start()
}
