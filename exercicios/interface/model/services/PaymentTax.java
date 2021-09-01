package model.services;

public interface PaymentTax {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
