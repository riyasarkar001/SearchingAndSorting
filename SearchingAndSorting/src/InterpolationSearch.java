
public class InterpolationSearch {

	public static void main(String[] args) {

		int a[]= {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
		int n=a.length;
		int k=13;
		int pos=search(a,n,k);
		System.out.println(pos);
	}

	private static int search(int[] a, int n, int k) {
		int low=0;
		int high=n-1;
		while(low<=high)
		{
		int mid=low+(high-low)*((k-a[low])/(a[high]-a[low]));
		if(a[mid]==k)
		{
			return mid+1;
		}
		if(k<a[mid])
		{
			high=mid-1;
		}
		else
		{
			low=mid+1;
		}
		}
		return -1;
	}

}
