import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 int x = sc.nextInt();
		 
		 int soma = 0;
		 while(x != 0) {
			 //o soma recebe o que já tinha nela + x
			 soma += x;
			 System.out.println("Programa rodando!");
			 x = sc.nextInt();
		 }
		 
		 System.out.println(soma);
		 
		
		 
		 sc.close();

	}

}
