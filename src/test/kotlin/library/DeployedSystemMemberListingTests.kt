package library

import library.actors.Member
import library.scenarios.MemberListingScenario
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

class DeployedSystemMemberListingTests : MemberListingScenario {
    private val port = 8000
    override val member: Member = DeployedSystemMember(port)

    private val server = createApp(port)

    @BeforeEach
    fun startApp() {
        server.start()
    }

    @AfterEach
    fun stopApp() {
        server.stop()
    }
}
