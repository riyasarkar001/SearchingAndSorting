
public class JumpSearch1 {

	public static void main(String[] args) {

		int a[]= {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		int n=a.length;
		int k=10;
		int low=0;
		int high=n-1;
		int res=search(a,low,high,k);
		System.out.println(res);
	}

	private static int search(int[] a, int low, int high, int k) {
		int m=(int) Math.sqrt(a.length);
		for(int i=0;i<m;i++)
		{
			if(k<a[m])
			{
				high=m-1;
			}
			else
			{
				low=m+1;
			}
		}
		for(int i=low;i<=high;i++)
		{
			if(a[i]==k)
			{
				return i+1;
			}
		}
		return -1;
	}

}
