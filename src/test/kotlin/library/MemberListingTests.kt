package library

import library.actors.Member
import library.domain.Library
import library.scenarios.MemberListingScenario

class MemberListingTests : MemberListingScenario {
    override val member: Member = LibraryMember(Library())
}
