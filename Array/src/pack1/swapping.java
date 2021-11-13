package pack1;

public class swapping {

	public static void main(String[] args) {
		
		int[] a = {23,34,54,32,12,90};
	
		
		int b;  //temporary variable
		
		for(int i =0; i<=(a.length-1); i++)
		{
			for(int j = i; j<=(a.length-1); j++)
			{
		
			b = a[i];  //assignment operator a[i]--> b
			a[i]=a[j];
			a[j]=b;
			
		    }
			
			
		}
		
		
		for(int i =0; i<=(a.length-1); i++)
		{
			System.out.println(a[i]);
		}
			
			
			
		}
	
	
}
