package library

import library.actors.Member
import library.domain.Library
import library.scenarios.MemberListingScenario

class SystemMemberListingTests : MemberListingScenario {
    override val member: Member = SystemMember(Library())
}