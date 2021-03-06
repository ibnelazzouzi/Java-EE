package ee7.jaxrs;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Anghel Leonard
 */
@Path("/account")
public class HelloUsersResource {

    @GET
    @Path("/admin")
    @Produces("text/plain")
    public String helloAdmin() {
        return "Hello, Admin!";
    }
    
    @GET    
    @Path("/user")
    @Produces("text/plain")
    public String helloUser() {
        return "Hello, User!";
    }
}
