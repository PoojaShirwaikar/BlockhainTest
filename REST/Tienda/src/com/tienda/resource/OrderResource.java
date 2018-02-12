package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;

public class OrderResource { // sub-resource class

	TiendaService ts = new TiendaService();

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{ord-num}")
	public Order fetchOrderDetailsForUser(@PathParam("uname") String username,
			@PathParam("ord-num") String number) throws OrderNotFoundException {
		Order order;
		order = new TiendaService().getOrderDetailsForUser(username, number);

		return order;

	}

	/*
	 * @GET
	 * 
	 * @Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML
	 * })
	 * 
	 * @Path("updates/{ord-num}") public Set<Order> updateOrderDetailsForUser(
	 * 
	 * @PathParam("uname") String username,
	 * 
	 * @PathParam("ord-num") String number) throws OrderNotFoundException {
	 * Order order; order = new TiendaService().getOrderDetailsForUser(username,
	 * number); Set<Order> orders; orders = new
	 * TiendaService().getAllOrdersForUser(username); orders.remove(order); //
	 * ts.setOrdersForUser(orders); return orders;
	 * 
	 * }
	 */

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("deletes/{ord-num}")
	public List<Order> updateOrderDetailsForUser(
			@PathParam("uname") String username,
			@PathParam("ord-num") String number) throws OrderNotFoundException {
		Order order;
		order = ts.getOrderDetailsForUser(username, number);
		List<Order> orders;
		orders = ts.getOrdersForUser(username);
		orders.remove(order);
		ts.setOrdersForUser(orders);
		return orders;

	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Set<Order> fetchAllOrdersForUser(@PathParam("uname") String username) {
		Set<Order> orders;
		orders = new TiendaService().getAllOrdersForUser(username);
		return orders;

	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createOrder(Order order) throws URISyntaxException {
		System.out.println(order.getNumber());
		System.out.println(order.getOrderId());
		return Response.created(new URI("http://localhost:8080/Tienda"))
				.build();
	}
}
