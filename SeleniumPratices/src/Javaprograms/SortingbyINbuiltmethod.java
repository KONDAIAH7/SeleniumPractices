package Javaprograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingbyINbuiltmethod {

	public static void main(String[] args) 
	{
		//Approach1
		
		/*int a[]	= {2,5,7,3,8,9};
		System.out.println("Array elments Before Sorting"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elments After Sorting"+Arrays.toString(a));
		*/
	//Approach2
		
	/*	int a[]	= {2,5,7,3,8,9};
		System.out.println("Array elments Before Sorting"+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Array elments Before Sorting"+Arrays.toString(a));
	*/	
		//Reverse order
		Integer a[]	= {2,5,7,3,8,9};
		System.out.println("Array elments Before Sorting"+Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array elments Before Sorting"+Arrays.toString(a));
		
	}

}
