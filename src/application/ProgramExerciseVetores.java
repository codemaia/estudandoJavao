package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExerciseVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		//PROBLEMA "NEGATIVOS"
		/*
		System.out.print("Quantos numero voce vai digitar? ");
		
		int n = sc.nextInt();
		
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			
			vect[i] = sc.nextInt();
						
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] 	< 0) {
				System.out.println(vect[i]);				
			}
			
			
		}
		*/
		
		
		
		
		//PROBLEMA "SOMA_VETOR"
		/*
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		
		double sum = 0.0;
		//double avg;
		System.out.print("VALORES = " );
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];
		}
		System.out.println();
		System.out.print("SOMA = " + sum);
		System.out.println();
		
		double avg = sum / vect.length;
		System.out.print("MEDIA = " + avg);
		*/
		
		
		
		//PROBLEMA "ALTURAS"
		
		int n;
		
		System.out.print("Quantas pessoas sera digitadas? ");
		n = sc.nextInt();
		
		String[] vectName = new String[n];
		int[] 	 vectIdade = new int[n];
		double[] vectAltura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			sc.nextLine();
			
			System.out.print("Name: ");
			vectName[i] = sc.nextLine();
			//sc.nextLine();
			
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			vectAltura[i] = sc.nextDouble();
		}
		System.out.println();
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			
			sum += vectAltura[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Altura média: %.2f", avg);
		System.out.println();
		
		System.out.print("Pessoas com menos de 16 anos: ");
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (vectIdade[i] < 16) {
				count++;
			}
		}
		
		double percent = 100 * count / n;
		System.out.println(percent + "%");
		
		for (int i = 0; i < n; i++) {
			
			if (vectIdade[i] < 16) {
				System.out.println(vectName[i]);
			}
		}
		
		
		
		sc.close();

	}

}
