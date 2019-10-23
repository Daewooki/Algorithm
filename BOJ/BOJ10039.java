import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10039 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score[] = { 0, 0, 0, 0, 0 };

		String reader = "";
		int i = 0;
		while ((reader = br.readLine()) != null) {
			if (Integer.parseInt(reader)< 40) {
				score[i] = 40;
			}else {
				score[i] = Integer.parseInt(reader);
			}
			i++;
		}
		int total = 0;
		for (int j = 0; j < score.length; j++) {
			total += score[j];
		}
		System.out.println(total / score.length);
		br.close();
	}
}
