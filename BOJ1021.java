import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> deq = new ArrayDeque<>();
		ArrayList<Integer> find = new ArrayList<>();

		String reader = "";
		String field[];

		reader = br.readLine();
		field = reader.split(" ");
		int deqSize = Integer.parseInt(field[0]);
		// initialize deq
		for (int i = 1; i <= deqSize; i++) {
			deq.add(i);
		}

		int num = Integer.parseInt(field[1]);

		reader = br.readLine();
		field = reader.split(" ");

		for (int i = 0; i < num; i++) {
			find.add(Integer.parseInt(field[i]));
		}
		
		int cnt = 0;
		for(int i=0; i<find.size(); i++) {
			if(deq.peekFirst().equals(find.get(i))) {
				deq.pollFirst();
			}else {
				int rTime = 0;
				int lTime = 0;
				while(deq.peekFirst()!=find.get(i)) {
					right(deq);
					rTime++;
				}
				for(int j=1; j<=rTime; j++) {
					left(deq);
				}
				while(deq.peekFirst()!=find.get(i)) {
					left(deq);
					lTime++;
				}
				if(rTime>=lTime) {
					cnt += lTime;
					deq.pollFirst();
				}else {
					cnt += rTime;
					deq.pollFirst();
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}

	static void right(Deque<Integer> deq) {
		int val = deq.pollLast();
		deq.addFirst(val);
	}

	static void left(Deque<Integer> deq) {
		int val = deq.pollFirst();
		deq.addLast(val);
	}
}
