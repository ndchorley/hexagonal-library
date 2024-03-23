package library

import library.domain.Library
import org.http4k.server.Jetty
import org.http4k.server.asServer

fun createApp(port: Int) = LibrarySystem(Library()).asServer(Jetty(port))

fun main() {
    createApp(9000).start()
}
