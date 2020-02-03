import java.io.IOException;
import java.util.Scanner;

public class BOJ1149 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());

		int arr[][] = new int[num][3];
		int cost[][] = new int[num][3];

		String reader = "";
		String field[];
		for (int i = 0; i < num; i++) {
			reader = sc.nextLine();
			field = reader.split(" ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(field[j]);
			}
		}

		cost[0][0] = arr[0][0];
		cost[0][1] = arr[0][1];
		cost[0][2] = arr[0][2];

		for (int i = 1; i < num; i++) {
			cost[i][0] = Min(cost[i - 1][1], cost[i - 1][2]) + arr[i][0];
			cost[i][1] = Min(cost[i - 1][0], cost[i - 1][2]) + arr[i][1];
			cost[i][2] = Min(cost[i - 1][0], cost[i - 1][1]) + arr[i][2];
		}

		System.out.println(Min(Min(cost[num - 1][0], cost[num - 1][1]), cost[num - 1][2]));
		sc.close();
	}

	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
