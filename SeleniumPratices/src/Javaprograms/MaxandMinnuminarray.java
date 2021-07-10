package Javaprograms;

public class MaxandMinnuminarray {

	public static void main(String[] args) 
	{
		int a[]= {20,35,25,60,75,100};
		
	/*	int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}

		System.out.println("Maximuim number in array"+max);
		*/
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}

		System.out.println("Minium  number in array"+min);

	}

}
