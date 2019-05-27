import java.io.IOException;
import java.util.Scanner;

public class BOJ2579 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int arr[] = new int[num + 1];

		int result[] = new int[num + 1];

		arr[0] = result[0] = 0;
		for (int i = 1; i <= num; i++) {
			arr[i] = sc.nextInt();
			result[i] = 0;
		}

		result[1] = result[0] + arr[1];
		result[2] = Math.max(result[1] + arr[2], result[0] + arr[2]);

		for (int i = 3; i < num + 1; i++) {
			result[i] = Math.max(result[i - 3] + arr[i - 1] + arr[i], result[i - 2] + arr[i]);
		}

		/*
		 * for (int i = 0; i < num + 1; i++) { System.out.print(result[i] + " "); }
		 */

		System.out.println(result[num]);

		sc.close();
	}
}
