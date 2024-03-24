package library

import library.actors.Member
import library.domain.Library
import library.scenarios.MemberListingBooksScenario

class MemberListingBooksTests : MemberListingBooksScenario {
    override val member: Member = LibraryMember(Library())
}
