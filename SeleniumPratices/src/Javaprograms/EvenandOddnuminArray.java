package Javaprograms;

public class EvenandOddnuminArray {

	public static void main(String[] args) 
	{
		int a[]	= {1,3,5,4,7,6,9};
		
		System.out.println("Even num in array");
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
				
		}
		*/
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		
		System.out.println("Odd num in array");
	/*	for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
				
		}
		*/
		for(int value :a)
		{
			if(value%2!=0)
				System.out.println(value);
		}

	}

}
