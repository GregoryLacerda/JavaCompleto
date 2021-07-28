package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		double soma = 0;
		for (OrderItem orderItem : items) {
			soma += orderItem.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order Moment:" + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client +"\n");
		sb.append("ORder items: \n");

		for (OrderItem orderItem : items) {
			sb.append(orderItem + "\n");
		}

		sb.append("Total Price: " + total());
		return sb.toString();
	}
}
