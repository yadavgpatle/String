package string1;

public class reverse {

	public static void main(String[] args) {
		
		String a= "My name is Sunny";
		int Length = a.length();
		String[]j = a.split(" ");
		String b = "";
		
		
	for(int i = 0; i<j.length; i++)
		{
			String word = j[i];
			String c = "";
		
		
		   for(int z = (word.length()-1); z>=0; z--)
		{
			c = c +word.charAt(z);  //1ym, eman		
		}
		
		
		//b = b + c + " ";
		
		System.out.print(c + " ");
		}
		//System.out.println(c);
		
	}

}
