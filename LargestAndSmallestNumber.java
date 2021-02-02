package arrayFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Elements of Array are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("The smallest two numbers are "+a[0]+" and "+a[1]);
		System.out.println("The largest two numbers are "+a[a.length-1]+" and "+a[a.length-2]);
	}

}
