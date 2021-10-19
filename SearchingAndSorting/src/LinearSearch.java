
public class LinearSearch {

	public static void main(String[] args) {
		int ar[]= {1,45,23,56,77};
		int n=ar.length;
		int k=9;
		int pos=search(ar,n,k);
		System.out.println(pos);

	}

	private static int search(int[] ar, int n, int k) {
		for(int i=0;i<n;i++)
		{
			if(ar[i]==k)
			{
				return i+1;
			}
		}
		return -1;
	}

}
