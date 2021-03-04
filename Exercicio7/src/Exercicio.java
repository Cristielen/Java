import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that´s awesome!");
		
		Post p1 =new Post(sdf.parse("21/06/2019 13:45:33"), 
				"Traveling to New Zealand", 
				"I´m go to visitng tis wonderful country",
				34);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
