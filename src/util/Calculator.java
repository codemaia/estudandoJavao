package util;

public class Calculator {
	//circumfference -> 2*PI*raio
	//volume -> 4 * PI * raio³ / 3
	
	public static final double PI = 3.14159;
	
	public static double Circumference(double radius) {
		return 2.00 * PI * radius;
	}
	
	public static double Volum(double radius) {
		return 4.00 * PI * radius * radius * radius / 3.00;
	}
	
	
	
}
