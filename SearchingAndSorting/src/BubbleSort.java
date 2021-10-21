
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {39,9,81,45,90,27,72,18};
		int n=a.length;
		bubbleSort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}

	}

	private static void bubbleSort(int[] a, int n) {

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	}

	}

}
