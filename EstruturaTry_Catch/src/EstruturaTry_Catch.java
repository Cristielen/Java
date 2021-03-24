import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstruturaTry_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Usuario\\Documents\\texto\\teste.txt");

		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e ) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
