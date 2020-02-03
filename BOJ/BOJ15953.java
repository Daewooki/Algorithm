import java.io.IOException;
import java.util.Scanner;

public class BOJ15953 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] b1 = { 500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10 };
		int[] b2 = { 512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64, 32, 32, 32, 32, 32, 32, 32, 32,
				32, 32, 32, 32, 32, 32, 32, 32 };

		for (int i = 0; i < num; i++) {
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			int sang1 = 0;
			int sang2 = 0;
			if (y1 != 0 && y1 > 0 && y1 < 22) {
				sang1 = b1[y1 - 1];
			}
			if (y2 != 0 && y2 > 0 && y2 < 32) {
				sang2 = b2[y2 - 1];
			}
			int sum = sang1 + sang2;
			if (sum == 0) {
				System.out.println("0");
			} else {
				System.out.println(sang1 + sang2 + "0000");
			}
		}
		sc.close();
	}
}
