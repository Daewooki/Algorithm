import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11866 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int idx = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= num; i++) {
			q.offer(i);
		}

		int cnt = 1;
		String answer = "<";
		while (q.size() != 1) {
			if (cnt != idx) {
				int a = q.poll();
				cnt++;
				q.offer(a);
			} else {
				int b = q.poll();
				cnt = 1;
				answer += b + ", ";
			}
		}
		answer += q.poll() + ">";
		System.out.println(answer);
	}
}
