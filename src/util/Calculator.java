package util;

public class Calculator {
	
	public final double PI = 3.14159; // constantes com letra maiúsculas
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

	public double circumference(double radius) {
		return 2 * PI * radius;
	}

}
