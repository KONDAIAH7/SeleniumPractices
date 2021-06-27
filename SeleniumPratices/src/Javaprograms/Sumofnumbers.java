package Javaprograms;

public class Sumofnumbers {

	public static void main(String[] args) 
	{
	int num=25061995;
	int sum=0;
	//for(int i=0;i)
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("Sum of digits of number is "+sum);

	}

}
