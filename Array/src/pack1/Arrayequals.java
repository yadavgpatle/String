package pack1;

import java.util.Arrays;

public class Arrayequals {
	
	public static void main(String[]args) {
	
		int a[] = {20,34,13,54,23};
		int b[]=  {34,45,56,12,34};
		int c[]=  {20,34,13,54,23};
		
		System.out.println(Arrays.equals(a, b));  
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
		
		
	

}
}
