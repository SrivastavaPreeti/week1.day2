package week1.day2;

import java.util.Arrays;

public class missingElementIntheArray {

	public static void main(String[] args) {
		
		int i = 1;
		int[] a = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		
		for(i=a[0];i<=a.length;i++)
		{
			if(i!=a[i-1]) 
			{
				System.out.println("The missing element in the array is: " +i);
				break;
			}
			
		}
 
	}

}
