package library

import library.actors.Member
import org.http4k.core.HttpHandler

class SystemMember(library: Library) : Member, HttpMember {
    override val system: HttpHandler = LibrarySystem(library)
}
