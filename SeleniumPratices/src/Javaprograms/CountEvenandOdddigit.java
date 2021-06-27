package Javaprograms;

public class CountEvenandOdddigit {

	public static void main(String[] args)
	{
		int number=12345;
		int even_count=0;
		int odd_count=0;
		
		while(number>0)
		{
			int rem=number%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			number=number/10;
			
		}
		System.out.println("Even digigit count is "+even_count);
		System.out.println("Odd digit coount is "+odd_count);

	}

}
