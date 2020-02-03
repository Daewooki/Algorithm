import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1463 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> nextarr = new ArrayList<>();

		if (num % 3 == 0) {
			arr.add(num / 3);
		}
		if (num % 2 == 0) {
			arr.add(num / 2);
		}
		if (num - 1 > 0) {
			arr.add(num - 1);
		}
		int cnt = 1;
		if (num == 1) {
			System.out.println("0");
		} else if (arr.contains(1)) {
			System.out.println(cnt);
		} else {
			for (int i = 0; i < arr.size(); i++) {
				int getnum = arr.get(i);
				if (getnum % 3 == 0) {
					if (!nextarr.contains(getnum / 3)) {
						nextarr.add(getnum / 3);
					}
				}
				if (getnum % 2 == 0) {
					if (!nextarr.contains(getnum / 2)) {
						nextarr.add(getnum / 2);
					}
				}
				if (getnum - 1 > 0) {
					if (!nextarr.contains(getnum - 1)) {
						nextarr.add(getnum - 1);
					}
				}
			}
			cnt++;
			if (nextarr.contains(1)) {
				System.out.println(cnt);
				arr.clear();
				nextarr.clear();
			} else {
				while (true) {
					arr.clear();
					arr.addAll(nextarr);
					nextarr.clear();
					for (int i = 0; i < arr.size(); i++) {
						int getnum = arr.get(i);
						if (getnum % 3 == 0) {
							if (!nextarr.contains(getnum / 3)) {
								nextarr.add(getnum / 3);
							}
						}
						if (getnum % 2 == 0) {
							if (!nextarr.contains(getnum / 2)) {
								nextarr.add(getnum / 2);
							}
						}
						if (getnum - 1 > 0) {
							if (!nextarr.contains(getnum - 1)) {
								nextarr.add(getnum - 1);
							}
						}
					}
					cnt++;
					if (nextarr.contains(1)) {
						System.out.println(cnt);
						arr.clear();
						nextarr.clear();
						break;
					}
				}
			}
		}
		sc.close();
	}
}
