import java.io.IOException;
import java.util.Scanner;

public class BOJ1003 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int N[][] = new int[41][2];

		N[0][0] = 1;
		N[0][1] = 0;
		N[1][0] = 0;
		N[1][1] = 1;

		for (int i = 2; i < 41; i++) {
			N[i][0] = N[i - 2][0] + N[i - 1][0];
			N[i][1] = N[i - 2][1] + N[i - 1][1];
		}

		for (int i = 0; i < num; i++) {
			int fib = sc.nextInt();

			System.out.println(N[fib][0] + " " + N[fib][1]);
		}
		sc.close();
	}
}
