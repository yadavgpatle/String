package string1;

public class Charactercount {

	public static void main(String[] args) {
      
		String a = "Yadav Patle Ok";
		int Length = a.length();
		int Count =0;
		int space = 0;
		

		for(int i =0; i<Length; i++)
		{
			if(a.charAt(i) !=' ')
				Count ++;
		}
		
		for(int i =0; i<Length; i++)
		{
			space ++;
		}
		System.out.println("Length of string is " + space);
		System.out.println(Count);

	}

}
