package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product1;
import entities.UsedProduct;

public class Program1 {
	
	
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product1> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+ i +" data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (typeProduct == 'i') {
				
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else if(typeProduct == 'u'){
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
				
			}else{
				list.add(new Product1(name, price));
			}
		}
		
		
		System.out.println("PRICE TAGS:");
		for (Product1 product1 : list) {
			System.out.println(product1.priceTag());
		}
		
		sc.close();
	}
	 
}
