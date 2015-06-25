package io.github.jorgefilho.swagger.resource;

import io.github.jorgefilho.swagger.domain.UserRequest;
import io.github.jorgefilho.swagger.resource.constants.ResourcePath;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ResourcePath.USER_PATH)
@Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
@Api(value=ResourcePath.USER_PATH, description = "Operations about users")
public class UserResource implements Serializable {

	private static final long serialVersionUID = -8533969043792887825L;

	@POST
	@Consumes({MediaType.APPLICATION_JSON})	
	@ApiOperation(value = "Create user", notes = "Creates a single user", position = 1)
	public Response insert(UserRequest user){
		// TODO: 
		return Response.ok().build();
	}
}
