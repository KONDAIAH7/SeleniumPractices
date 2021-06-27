package Javaprograms;

public class Swapnumbers {

	public static void main(String[] args) 
	{
		int a,b;
		a=10;
		b=20;
		System.out.println("Before swaping"+a+" "+b);
	/*	//1 using third variable
		int c=a;
		a=b;
		b=c;
	*/
		
	/*		//2 using + & -
		
			a=a+b;
			b=a-b;
			a=a-b;
			
	*/
		
	/*	//3 using multiplication & divison
		
		a=a*b;
		b=a/b;
		a=a/b;
		
	*/
	
	/*	//4 bitwise xor
		
		a= a^b;//30
		b=a^b;//10
		a=a^b;//20
		
	*/
		//5 single statement
		
		b=a+b-(a=b);
		
		
		
		
		
		
		
		
		
		System.out.println("after swapping"+a+" "+b);

	}

}
