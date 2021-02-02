package arrayFundamentals;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size m and n");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter the first Matrix elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("Enter the second Matrix elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("First two Matrix are:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of the matrix is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
