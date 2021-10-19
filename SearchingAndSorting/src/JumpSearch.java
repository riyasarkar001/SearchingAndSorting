
public class JumpSearch {

	public static void main(String[] args) {
		int a[]= {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		int n=a.length;
		int k=610;
		int res=search(a,n,k);
		System.out.println(res);

	}

	private static int search(int[] a, int n, int k) {
		int m=(int) Math.sqrt(n);
		int prev=0;
		while(a[Math.min(m, n)-1]<k)
		{
			prev=m;
			m+=Math.sqrt(n);
			if(prev>=n)
			{
				return -1;
			}
		}
		while(a[prev]<k)
		{
			prev++;
			if(prev==Math.min(m, n))
			{
				return -1;
			}
		}
		if(a[prev]==k)
		{
			return prev+1;
		}
		
		return -1;
		
		
	}
		
}
