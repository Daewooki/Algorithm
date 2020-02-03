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

		int h = 0;
		int w = 0;
		int time = 0;

		int ansH = 0;
		int ansW = 0;

		for (int i = 0; i < num; i++) {
			reader = br.readLine();
			field = reader.split(" ");
			h = Integer.parseInt(field[0]);
			w = Integer.parseInt(field[1]);
			time = Integer.parseInt(field[2]);

			if (time <= h) {
				ansH = time;
				ansW = 1;
				System.out.println(ansH+"0"+ansW);
			} else {
				ansH = time % h;
				ansW = time / h + 1;

				if (ansH == 0) {
					ansH = h;
					ansW--;
				}
				if (ansW < 10) {
					System.out.println(ansH + "0" + ansW);
				} else {
					System.out.println(ansH + "" + ansW);
				}
			}
		}
		br.close();
	}
}
