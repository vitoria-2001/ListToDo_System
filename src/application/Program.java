package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ListToDo;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("How many types of lists, do you need? ");
		int m = sc.nextInt();
		
	
		List <ListToDo> list = new ArrayList <> () ;
		List<String> topics = new ArrayList<> ();
		
		for (int i=1; i<=m; i++) {
			System.out.print("Date of list - (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());
			
			sc.nextLine();
			System.out.print("Theme of this to-do list: ");
			String theme=sc.nextLine();
			
			System.out.print("How many chores do you have of this theme: ");
			int n= sc.nextInt();
			
			
				for (int l=1; l<=n; l++) {
					System.out.print("Topic #" + l + ": ");
					sc.nextLine();
					String topic=sc.nextLine();
					topics.add(topic);
				}	
		}
		
		
		
		
		
		sc.close();
	}

}

