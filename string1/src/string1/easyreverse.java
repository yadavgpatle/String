package string1;

import java.util.Scanner;

public class easyreverse {

	public static void main(String[]args){
		
		
		// using scanner
				Scanner scan= new Scanner (System.in);
				System.out.println("enter the string");
				String data =scan.nextLine();
				 
			
				

		//String a = "Yadav Is My name";  //initialize string
		String b = "";  //blank string
		
		

		for(int i =(data.length()-1); i>=0; i--)
		{

		   b = b + data.charAt(i);   //concatenation is used here 
		}
		System.out.println(b);
		}
}

