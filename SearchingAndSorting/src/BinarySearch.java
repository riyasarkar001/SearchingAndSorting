
public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 66, 77 };
		int n = a.length;
		int left = 0;
		int right = n - 1;
		int k = 6;
		int pos=search(a, left, right, k);
		System.out.println(pos);

	}

	private static int search(int[] a, int left, int right, int k) {
		int pos = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (k == a[mid]) {
				pos = mid + 1;
				return pos;
			}
			if (k < a[mid]) {
				return search(a, left, mid - 1, k);
			} else {
				return search(a, mid + 1, right, k);
			}
		}
		return pos;
	}

}
