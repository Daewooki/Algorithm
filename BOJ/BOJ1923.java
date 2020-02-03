import java.io.IOException;
import java.util.Scanner;

public class BOJ1923 {
	static int[][] list;

	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, tmp = 0;
		list = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				list[i][j] = sc.nextInt();

				if (j == 1)
					list[i][j] = list[i - 1][j] + list[i][j];
				else if (j == i)
					list[i][j] = list[i - 1][j - 1] + list[i][j];
				else
					list[i][j] = Math.max(list[i - 1][j - 1], list[i - 1][j]) + list[i][j];

				if (sum < list[i][j])
					sum = list[i][j];
			}
		}
		System.out.println(sum);
	}
}
