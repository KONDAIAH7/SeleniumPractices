package Javaprograms;

public class MissingnumberinArray {

	public static void main(String[] args) 
	{
		//Array should not allow duplicate
		//Arrat not have sorted
		
		int a[]	= {1,3,5,4};
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements of Array"+sum1);
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of array"+sum2);
		int missingnum=sum2-sum1;
		System.out.println("Missing num in array"+missingnum);

	}

}
