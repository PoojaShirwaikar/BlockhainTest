package com.tienda.bean;

import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.tienda.util.OrderStatus;

@XmlRootElement(name = "order")
public class Order {
	private int orderId;
	private String number;
	private Date orderedon;
	private User orderedby;
	private OrderStatus status;
	private Set<Product> cart;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getOrderedon() {
		return orderedon;
	}

	public void setOrderedon(Date orderedon) {
		this.orderedon = orderedon;
	}

	public User getOrderedby() {
		return orderedby;
	}

	public void setOrderedby(User orderedby) {
		this.orderedby = orderedby;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Set<Product> getCart() {
		return cart;
	}

	public void setCart(Set<Product> cart) {
		this.cart = cart;
	}

	public Order(int orderId, String number, Date orderedon, User orderedby,
			OrderStatus status, Set<Product> cart) {
		super();
		this.orderId = orderId;
		this.number = number;
		this.orderedon = orderedon;
		this.orderedby = orderedby;
		this.status = status;
		this.cart = cart;
	}

	public Order() {
		super();

	}

}
