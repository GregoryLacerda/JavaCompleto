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
	private List<OrderItem> item = new ArrayList<>();
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
	
	public List<OrderItem> getOrderItem() {
		return item;
	}
	
	public void addItem(OrderItem item) {
		this.item.add(item);
	}
	public void removeItem(OrderItem item) {
		this.item.remove(item);
	}
	
	public Double total() {
	 	double soma = 0;
		for (OrderItem orderItem : item) {
			soma += orderItem.subTotal();
		}		
		return soma;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order Moment:"+ sdf.format(moment) +"\n");
		sb.append("Order Status: " + status +"\n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sb.append("Client: " + client.getName() + " ("  + sdf.format(client.getBirthDate()) + ") - "+ client.getEmail()+"\n");
		sb.append("ORder items: \n");
		
		for (OrderItem orderItem : item) {
			sb.append(orderItem.getProduct().getName() + ", "
					+ orderItem.getProduct().getPrice() + 
					", Quantity: " + orderItem.getQuantity()+ 
					", Subtotal" + orderItem.subTotal()+ "\n");
		}
		
		sb.append("Total Price: " + total());
		return sb.toString();
	}
}
