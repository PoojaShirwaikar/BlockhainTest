package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.tienda.bean.ExceptionMessage;
import com.tienda.bean.Link;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;

@Path("/users")
public class UserResource { // root resource class

	@Context
	private ResourceContext resourceContext;

	@Context
	private UriInfo uriinfo;

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// MIME type /media type
	@Path("{uname}")
	// template parameter
	public User fetchUserDetails(@PathParam("uname") String username)
			throws UserNotFoundException { // resource method
		User user;
		user = new TiendaService().getUserDetails(username);
		user.setLinks(new HashSet<Link>());

		UriBuilder baseBuilder = uriinfo.getBaseUriBuilder();
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class, "getSubResource").resolveTemplate(
				"uname", username);

		user.getLinks()
				.add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate())
						.resolveTemplate("sub-resource-name", "orders").build()
						.toString(), "collection", String.format("%s,%s",
						MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)));

		user.getLinks().add(
				new Link(UriBuilder.fromPath(baseBuilder.toTemplate())
						.resolveTemplate("sub-resource-name", "wishlist")
						.build().toString(), "collection", String.format(
						"%s,%s", MediaType.APPLICATION_JSON,
						MediaType.APPLICATION_XML)));

		return user;
	}

	/*@POST
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createUserDetails() throws URISyntaxException { // resource
																	// // method
		User user = new User(5, "Nidhi", "nt19@gmail.com");
		return Response.created(new URI("http://localhost:8080/Tienda"))
				.build();
	}
*/
	@Path("{uname}/{sub-resource-name}")
	public Object getSubResource(
			@PathParam("sub-resource-name") String subResourceName) { // sub-resource
																		// locator
		if ("orders".equals(subResourceName)) {

			return resourceContext.getResource(OrderResource.class);

		} else if ("wishlist".equals(subResourceName)) {
			return resourceContext.getResource(WishlistResource.class);

		}

		throw new WebApplicationException(Response
				.status(Response.Status.NOT_FOUND)
				.entity(new ExceptionMessage("Resource not found")).build());

	}
}
