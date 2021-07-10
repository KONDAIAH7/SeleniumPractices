package Javaprograms;

public class Searchingofelementinarray {

	public static void main(String[] args) 
	{
		int a[]= {10,25,30,35,80,50,70};
		int searcele=50;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(searcele==a[i])
			{
				System.out.println("Element is present in Array at " +i);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Element is not in array");
		

	}

}
