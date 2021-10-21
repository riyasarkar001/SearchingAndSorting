
public class InsertionSort {

	public static void main(String[] args) {

		int a[]= {39,9,81,45,90,27,72,18};
		int n=a.length;
		selectionSort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
	}

	private static void selectionSort(int[] a, int n) {

		for(int i=1;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}

}
