package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product1;
import entities.enums.OrderStatus;

public class Program {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date: (DD/MM/YYYY)");
		String birthDate = sc.nextLine();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		System.out.print("How many items to this order?");
		Integer items = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, sdf.parse(birthDate)));
		
		for (int i = 1; i <= items; i++) {
			System.out.println("Enter #"+ i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.next();
			
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			order.addItem(new OrderItem(quantity, new Product1(pName, pPrice)));
			
		}
		
		System.out.println(order);
		
		sc.close();
	}
}
