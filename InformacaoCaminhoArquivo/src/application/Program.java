package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Apenas o nome do arquivo
		System.out.println("getName: " + path.getName());
		//Apenas o caminho sem o nome do arquivo
		System.out.println("getParent: " + path.getParent());
		//Caminho completo
		System.out.println("geetPath: " + path.getPath());

		sc.close();
	}

}
