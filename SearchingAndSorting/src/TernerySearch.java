
public class TernerySearch {
	public static void main(String args[]) {
		int a[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
		int n = a.length;
		int k = 42;
		int low = 0;
		int high = n - 1;
		int pos = search(a, low, high, k);
		System.out.println(pos);
	}

	private static int search(int[] a, int low, int high, int k) {
		if (low <= high) {
			int mid1 = low + (high - low) / 3;
			int mid2 = mid1 + (high - low) / 3;
			if (a[mid1] == k) {
				return mid1 + 1;
			}
			if (a[mid2] == k) {
				return mid2 + 1;
			}
			if (k < a[mid1]) {
				return search(a, low, mid1 - 1, k);
			}
			if (k > a[mid2]) {
				return search(a, mid2 + 1, high, k);
			}
			return search(a, mid1 + 1, mid2 - 1, k);
		}
		return -1;
	}

}
