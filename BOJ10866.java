import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Deque<Integer> deq = new ArrayDeque<>();

		String reader = "";
		String field[];

		while ((reader = br.readLine()) != null) {
			if (reader.startsWith("push_back")) {
				field = reader.split(" ");
				int val = Integer.parseInt(field[1]);
				deq.addLast(val);
			} else if (reader.startsWith("push_front")) {
				field = reader.split(" ");
				int val = Integer.parseInt(field[1]);
				deq.addFirst(val);
			} else if (reader.equals("front")) {
				if (deq.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deq.peekFirst());
				}
			} else if (reader.equals("back")) {
				if (deq.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deq.peekLast());
				}
			} else if (reader.equals("size")) {
				System.out.println(deq.size());
			} else if (reader.equals("empty")) {
				if (deq.size() == 0) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (reader.equals("pop_front")) {
				if (deq.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deq.pollFirst());
				}
			} else if (reader.equals("pop_back")) {
				if (deq.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deq.pollLast());
				}
			}
		}

		br.close();
	}
}
