package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PayPalTax;
import model.services.PaymentService;

public class Program8 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contracts = new Contract(number, date, totalValue);
		System.out.println(date);
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		PaymentService payment = new PaymentService(new PayPalTax());
		
		payment.processContracts(contracts, installments);
		
		System.out.println("Installments: ");
		
		for (Installment installment : contracts.getInstallment()) {
			System.out.println(installment.getDueDate() +" - " + installment.getAmount());
		}

	}

}
