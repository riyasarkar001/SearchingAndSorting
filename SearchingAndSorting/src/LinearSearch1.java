import java.util.*;

public class LinearSearch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		int k = sc.nextInt();
		search(a, n, k);

	}

	private static void search(int[] a, int n, int k) {
		int left = 0;
		int right = n - 1;
		int pos = -1;
		while (left <= right) {
			if (a[left] == k) {
				pos = left + 1;
				System.out.println("Element found at pos " + pos);
				break;
			}
			if (a[right] == k) {
				pos = right + 1;
				System.out.println("Elemnt found at pos " + pos);
				break;
			}
			left++;
			right--;
		}
		if (pos == -1) {
			System.out.println("Element not found");
		}
	}

}
