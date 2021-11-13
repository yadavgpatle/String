package string1;

public class String1 {

	public static void main(String[] args) {
		
		
		int a [] = {0,2,3,4,5,6,7};
		int b = (a.length-1);
		int c = 1;
		for(int i = 0; i<b; i++)
		{
			for(int j=i+1; j<=b; j++)
			{
				if(a[i]>a[j])
				{
					c = a[i];
				}
			
		    }
	}
		System.out.println(c);
	}
	
	
}



