
public class SelectionSort {

	public static void main(String[] args) {

		int a[]= {39,9,81,45,90,27,72,18};
		int n=a.length;
		selectSort(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}

	}

	private static void selectSort(int[] a, int n) {

		for(int i=0;i<n;i++)
		{
			int pos=smallest(a,i,n);
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
	}

	private static int smallest(int[] a, int i, int n) {
		int pos=i;
		int small=a[i];
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<small)
			{
				small=a[j];
				pos=j;
			}
		}
		return pos;
		
	}


}
