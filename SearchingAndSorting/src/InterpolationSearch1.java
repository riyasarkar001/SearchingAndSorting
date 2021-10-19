
public class InterpolationSearch1 {

	public static void main(String[] args) {
		int a[]= {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};
		int k=35;
		int low=0;
		int high=a.length-1;
		int pos=search(a,low,high,k);
		System.out.println(pos);

	}

	private static int search(int[] a, int low, int high, int k) {
		while(low<=high && k>=a[low] && k<=a[high])
		{
			int mid=low+(high-low)*((k-a[low])/(a[high]-a[low]));
			if(a[mid]==k)
			{
				return mid+1;
			}
			if(k<a[mid])
			{
				return search(a,low,mid-1,k);
			}
			else
			{
				return search(a,mid+1,high,k);
			}
		}
		return -1;
	}

}
