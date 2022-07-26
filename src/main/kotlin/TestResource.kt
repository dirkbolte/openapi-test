import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/test")
class TestResource {
    @GET
    fun testMethod(): TestResponse {
        return TestResponse()
    }
}
