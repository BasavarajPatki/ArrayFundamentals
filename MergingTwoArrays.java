package arrayFundamentals;

public class MergingTwoArrays {

	public static void main(String[] args) {
		int a[]= {2,4,8,5,};
		int b[]= {3,10,11,20};
		int k=0;
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}
		System.out.println("Merged Array is:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
