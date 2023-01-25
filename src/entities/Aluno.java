package entities;

public class Aluno {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	
	public void result() {
		
		if (notaFinal() > 60.00) {
			System.out.println("FINAL GRADE = " + notaFinal());
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE = " + notaFinal());
			System.out.println("FAILED");
			System.out.println("MISSING " + (60.0 - notaFinal()) + " POINTS");
		}
	}

}
