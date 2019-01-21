import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String seq = br.readLine();
		seq = seq.toLowerCase();

		char alph[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int alphCount[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < seq.length(); i++) {
			alphCount[seq.charAt(i) - 97]++;
		}
		
		int maxIdx = 0;
		for (int i = 0; i < alphCount.length; i++) {
			if (alphCount[i] >= alphCount[maxIdx]) {
				maxIdx = i;
			}
		}
		int maxCnt = 0;
		for (int i = 0; i < alphCount.length; i++) {
			if (alphCount[maxIdx] == alphCount[i]) {
				maxCnt++;
			}
		}

		if (maxCnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(alph[maxIdx]);
		}
		br.close();
	}
}
