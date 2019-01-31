import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int gap = 1;
		int cnt = 1;
		int i = 1, j = 1;

		boolean dir = true; // true=leftdown, false=rightup.

		if (num == 1) {
			System.out.println(i + "/" + j);
		} else {
			cnt = 2;
			j = 2;
			if (num == 2) {
				System.out.println(i + "/" + j);
			} else {
				while (num != cnt) {
					for (int k = 1; k < cnt; k++) {
						if (dir == true) {
							i++;
							j--;
							cnt++;
							if (num == cnt) {
								System.out.println(i + "/" + j);
								break;
							} else if (j == 1) {
								cnt++;
								i++;
								dir = false;
								if (num == cnt) {
									System.out.println(i + "/" + j);
									break;
								}
							}
						} else if (dir == false) {
							j++;
							i--;
							cnt++;
							if (num == cnt) {
								System.out.println(i + "/" + j);
								break;
							} else if (i == 1) {
								cnt++;
								j++;
								dir = true;
								if (num == cnt) {
									System.out.println(i + "/" + j);
									break;
								}
							}
						}
					}
				}
			}
		}
		br.close();
	}
}
