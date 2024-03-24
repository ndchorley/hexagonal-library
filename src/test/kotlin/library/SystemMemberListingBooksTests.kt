package library

import library.actors.Member
import library.domain.Library
import library.scenarios.MemberListingBooksScenario

class SystemMemberListingBooksTests : MemberListingBooksScenario {
    override val member: Member = SystemMember(Library())
}