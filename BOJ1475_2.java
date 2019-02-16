import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int set[] = { 1, 1, 1, 1, 1, 1, 2, 1, 1 };

		int num = 1;
		int j=0;
		
		String reader = "";
		reader = br.readLine();
		
		for (int i = 0; i < reader.length(); i++) {
			j = reader.charAt(i) - '0';
			if (j == 6 || j == 9) {
				j = 6;
				if (set[j] == 0) {
					num++;
					for(int k = 0; k<set.length; k++) {
						set[k]++;
					}
				} else {
					set[j]--;
				}
			} else {
				if (set[j] == 0 && i == reader.length() - 1) {
					num++;
					for(int k = 0; k<set.length; k++) {
						set[k]++;
					}
					set[j]--;
				} else if (set[j] == 0) {
					num++;
					for(int k = 0; k<set.length; k++) {
						set[k]++;
					}
					set[j]--;
				} else {
					set[j]--;
				}
			}
		}
		System.out.println(num);

		br.close();
	}
}
