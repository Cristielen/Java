import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Name: ");
		aluno.name = sc.nextLine();
		
		System.out.println("nota 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		
		if(aluno.notaMedia() > 60.0) {
			System.out.println("FINAL GRADE = " + aluno.notaMedia() + " PASS"); 
		}
		else {
			System.out.println("FINAL GRADE = " + aluno.notaMedia() + " FAILED" + " MISSING: " + aluno.notaFinalFailed() + " POINTS");
		}
		
		
		
		
		
		sc.close();
				
		
		
		
		
		
		
	}

}
