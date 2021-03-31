package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LerCaminhoArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Usuario\\Music\\in.csv");
		Scanner sc = null;
		
		System.out.println("Caminho do arquivo: " + file);
		
		//lê o arquivo
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (IOException e) { 
			System.out.println("Error " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		
		
		
		
		
		
		
		

	}

}
