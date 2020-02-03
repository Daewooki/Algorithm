import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reader = br.readLine();

		int num = Integer.parseInt(reader);

		int count = 1;
		int gap = 5;
		int six = 6;
		int start = 2;
		int end = start + gap;

		if (num == 1) {
			System.out.println(count);
		} else {
			while (start <= num) {
				if (num <= end && num >= start) {
					count++;
					System.out.println(count);
					break;
				} else {
					start = end + 1;
					gap += six;
					end = start + gap;
					count++;
				}
			}
		}
		br.close();
	}
}
