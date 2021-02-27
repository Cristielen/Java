import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de linhas: ");
		int l = sc.nextInt();

		System.out.println("Número de colunas: ");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Escolha um número da matriz: ");
		int num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.printf("Position: " + i , j);
				}
				 if (j > 0){
                     System.out.printf("Left: %d%n", mat[i][j-1]);
                 }
                 if (j < c - 1){
                     System.out.printf("Right: %d%n", mat[i][j+1]);
                 }
                 if (i > 0){
                     System.out.printf("Up: %d%n", mat[i-1][j]);
                 }
                 if (i < l - 1){
                     System.out.printf("Down: %d%n", mat[i+1][j]);
                 }
			}
		}

	}

}
