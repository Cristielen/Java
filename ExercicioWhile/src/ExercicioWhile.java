import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int pass = 0;
		
		System.out.println("Informe a senha: ");
		pass = sc.nextInt();
		
		
		while(pass != 2002) {
			System.out.println("Senha invalida");
			pass = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();

	}

}
