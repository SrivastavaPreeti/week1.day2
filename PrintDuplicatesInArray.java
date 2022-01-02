package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = a.length;
		int count;
		
		for(i=0;i<=len-1;i++)
		{
			count=0;
			for(j=i+1;j<=len-1;j++)
			{
				if(a[i]==a[j])	
					{
						count=count+1;
					}
			}
			if(count>0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
