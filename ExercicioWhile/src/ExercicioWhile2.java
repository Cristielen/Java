import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int  x,y = 0;
		
		System.out.println("Escreva o quadrante X: ");
		x = sc.nextInt();
		
		System.out.println("Esreva o quadrante Y: ");
		y = sc.nextInt();
		
		while( x == 0 || y == 0 ) {
			System.out.println("Errado");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Certo");

	}

}
