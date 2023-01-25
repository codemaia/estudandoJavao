package entities;

public class Rectangle {

	//area = b * h
	//perimeter = p = 2(b+h)
	//diagonal = d = math.sqr(Math.pow(b,2) + Math.pow(h,2))
	
	public double width;
	public double height;
	
	
	//métodos / funções
	public double area() {
		return width * height;
	}
	
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal () {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	
}
