package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgamAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		aluno.result();
		
		
		sc.close();
	}

}
