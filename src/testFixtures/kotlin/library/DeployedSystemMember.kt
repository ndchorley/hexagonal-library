package library

import org.http4k.client.ApacheClient
import org.http4k.core.HttpHandler

class DeployedSystemMember(port: Int) : HttpMember {
    override val baseUri: String = "http://localhost:$port"
    override val system: HttpHandler = ApacheClient()
}
