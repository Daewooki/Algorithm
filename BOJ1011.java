import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String reader = "";
		String field[];

		int dist = 0;
		int postSqrt = 0;
		int preSqrt = 0;

		for (int i = 0; i < num; i++) {
			reader = br.readLine();
			field = reader.split(" ");

			dist = Integer.parseInt(field[1]) - Integer.parseInt(field[0]);

			if (Math.sqrt(dist) % 1 == 0) {
				System.out.println((int) Math.sqrt(dist) * 2 - 1);
			} else {
				preSqrt = (int) Math.sqrt(dist);
				postSqrt = preSqrt + 1;

				if (Math.pow(preSqrt, 2) + postSqrt <= dist) {
					System.out.println(postSqrt * 2 - 1);
				} else {
					System.out.println(postSqrt * 2 - 2);
				}
			}
		}
		br.close();
	}
}
