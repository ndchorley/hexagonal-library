package library

import org.http4k.client.ApacheClient
import org.http4k.core.HttpHandler

class DeployedSystemMember : HttpMember {
    private val port: Int = 8000
    override val baseUri: String = "http://localhost:$port"
    override val system: HttpHandler = ApacheClient()
}
