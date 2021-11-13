package pack1;

public class duplicatearray {

	public static void main(String[] args) {
		int a[] = {32,32,43,43,54};
		int  b =0;
		
		
		for(int i=0; i<=(a.length - 1); i++)
		{
			for(int j = i+1; j<=(a.length-1); j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
			    }
		}

	}

	}
}
