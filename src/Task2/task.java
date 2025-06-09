package Task2;

import java.util.Scanner;

public class task {

	
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		int [] arr =new int  [3];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
