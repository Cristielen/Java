package entities;

public class Aluno {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double notaMedia() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaFinalFailed() {
		double somaNota =  nota1 + nota2 + nota3;
		return 60.0 - somaNota;
	}
	
	

}
