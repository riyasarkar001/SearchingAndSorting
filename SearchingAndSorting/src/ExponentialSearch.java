import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		int a[]= {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
		int k=2;
		int low=0;
		int high=a.length-1;
		int pos=search(a,low,high,k);
		System.out.println(pos);

	}

	private static int search(int[] a, int low, int high, int k) {
		if(a[0]==k)
		{
			return 1;
		}
		int i=1;
		while(i<a.length && a[i]<=k)
		{
			i=i*2;
		}
		return Arrays.binarySearch(a, i/2, Math.min(i, a.length-1),k);
	}

}
