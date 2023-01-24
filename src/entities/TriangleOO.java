package entities;

// ESTUDO DE ORIENTAÇÃO A OBJETOS

public class TriangleOO {
	
	//ATRIBUTOS
	public double a;
	public double b;
	public double c;
	
	
	//METODO / FUNÇÃO
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
