package io.github.jorgefilho.swagger.resource;

import io.github.jorgefilho.swagger.domain.UserRequest;
import io.github.jorgefilho.swagger.resource.constants.ResourcePath;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ResourcePath.USER_PATH)
@Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
public class UserResource implements Serializable {

	private static final long serialVersionUID = -8533969043792887825L;

	@POST
	@Consumes({MediaType.APPLICATION_JSON})	
	public Response insert(UserRequest user){
		// TODO: 
		return Response.ok().build();
	}
}
