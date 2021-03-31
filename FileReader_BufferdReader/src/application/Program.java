package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	// Escrever no arquivo
	public static void main(String[] args) {
		String [] lines = new String[] {
				"Good afternoor, Cris!"
		};
		
		String path = "C:\\Users\\Usuario\\Music\\in.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
