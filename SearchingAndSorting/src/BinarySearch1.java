
public class BinarySearch1 {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 66, 77 };
		int n = a.length;
		int k = 66;
		int pos=search(a, k);
		System.out.println(pos);

	}

	private static int search(int[] a, int k) {
		int pos = -1;
		int left=0;
		int right=a.length-1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (k == a[mid]) {
				pos = mid + 1;
				return pos;
			}
			if (k < a[mid]) {
				right=mid-1;
			} else {
				left=mid+1;
			}
		}
		return pos;
	}

}
