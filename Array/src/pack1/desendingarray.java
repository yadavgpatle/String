package pack1;

public class desendingarray {

	public static void main(String[] args) {
		int a[] = {32,5,43,4,54};
		int  b =0;
		
		
		for(int i=0; i<=(a.length - 1); i++)
		{
			for(int j = i+1; j<=(a.length-1); j++)
			{
				if(a[i]>a[j])
				{
					b = a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
	System.out.println("Gratest no. from array is " + a[a.length - 1]);	
	
	System.out.println("and array in increasing order as follow");
		
for(int i = 0; i<=(a.length-1); i ++)
{
	System.out.println(a[i]);
}
	}

}
