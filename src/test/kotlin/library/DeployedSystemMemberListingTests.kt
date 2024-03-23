package library

import library.actors.Member
import library.scenarios.MemberListingScenario
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

class DeployedSystemMemberListingTests : MemberListingScenario {
    override val member: Member = DeployedSystemMember()

    private val server = createApp(8000)

    @BeforeEach
    fun startApp() {
        server.start()
    }

    @AfterEach
    fun stopApp() {
        server.stop()
    }
}
