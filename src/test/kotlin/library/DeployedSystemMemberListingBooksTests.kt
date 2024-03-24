package library

import library.actors.Member
import library.scenarios.MemberListingBooksScenario
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

class DeployedSystemMemberListingBooksTests : MemberListingBooksScenario {
    private val port = 8000
    override val member: Member = DeployedSystemMember(port)

    private val server = createServer(port)

    @BeforeEach
    fun startApp() {
        server.start()
    }

    @AfterEach
    fun stopApp() {
        server.stop()
    }
}
