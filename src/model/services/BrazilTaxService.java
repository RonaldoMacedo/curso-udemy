package model.services;

public class BrazilTaxService {
	
	public Double tax(double amount) {
		if(amount <= 100) {
			return amount * .2;
		}else {
			return amount * .15;
		}
	}

}
