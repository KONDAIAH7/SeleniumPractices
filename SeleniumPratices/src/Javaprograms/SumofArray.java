package Javaprograms;

public class SumofArray {

	public static void main(String[] args) 
	
	{
		int a[]= {1,3,4,5,6,2,3,1};
		int sum=0;
		
	/*	for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		*/
		//Enhanced for loop
		for(int value :a)
		{
			sum=sum+value;
		}
		
		System.out.println(sum);

	}

}
