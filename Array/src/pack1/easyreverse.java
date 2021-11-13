package pack1;

public class easyreverse { //

	public static void main(String[] args) {
		
		
		
		int a[] = {23,34,23,45,23,17};
		
		System.out.println("Following is Iterate Array");
		
		for(int i =0; i<=(a.length-1); i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Following is reverse Array");
		
		for(int i =(a.length-1); i>=0; i--)
		{
			System.out.println(a[i]);
		}

	}

}
