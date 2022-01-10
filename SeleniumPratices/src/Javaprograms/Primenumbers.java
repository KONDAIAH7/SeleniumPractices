package Javaprograms;

public class Primenumbers {

	public static void main(String[] args) 
	{
		int i,j,k;
		
		for(i=2;i<100;i++)
		{
			k=0;	
			
			for(j=2;j<i;j++)
			{
				if(j%i==1)
					k=1;
					break;
				
			}
			if(k==0)
				System.out.print("primenumbers are"+i);
		}

	}

}
