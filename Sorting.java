package arrayFundamentals;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		int temp;
		
		int a[]=new int[size];
		System.out.println("Enter the array numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
