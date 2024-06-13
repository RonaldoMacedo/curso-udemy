package util;

public class CurrencyConverter {
	
	public static final double DOLAR_PRICE = 3.10;
	
	public static double calcReal(double real) {
		return (real * DOLAR_PRICE) + (real * DOLAR_PRICE * 0.06);
	}

}
