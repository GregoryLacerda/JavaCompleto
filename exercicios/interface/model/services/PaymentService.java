package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class PaymentService {
	
	private Contract contracts;
	private Calendar cal;
	private PaymentTax tax;
	
	public PaymentService(PaymentTax tax) {
		this.tax = tax;
	}
	
	public void processContracts(Contract contract, Integer months) {
		
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {		
			
			Date date = addMonth(contract.getDate(), i);
			
			double updatedQuota = basicQuota + tax.interest(basicQuota, i);
            double fullQuota =  updatedQuota + tax.paymentFee(updatedQuota);
			
			contract.setInstallment(new Installment(date, fullQuota));
			
		}		
		
	}
	
	public Date addMonth(Date date, int i) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, i);
		
		return cal.getTime();
		
	}
	
}
