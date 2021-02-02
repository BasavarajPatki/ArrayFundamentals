package arrayFundamentals;

import java.util.Arrays;

public class SearchingAnElement {

	public static void main(String[] args) {
int a[]= {2,4,8,5,22,12,13};
		
		int key=12;//integer to be searched
		int flag=0;
		int location=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				location=i+1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Element is found at "+ location);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
