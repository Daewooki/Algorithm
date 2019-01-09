import java.io.IOException;
import java.util.Scanner;

public class BOJ1065 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			boolean ishansoo = false;
			ishansoo = hansoo(i);
			if (ishansoo == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	static boolean hansoo(int n) {
		String a = String.valueOf(n);
		if (a.length() <= 2) {
			return true;
		}
		if (a.length() >= 3) {
			int cha = a.charAt(1)-a.charAt(0);
			int chatemp = 0;
			for (int i = 2; i < a.length(); i++) {
				chatemp = a.charAt(i) - a.charAt(i-1);
				if(cha != chatemp) {
					return false;
				}
			}
		}
		return true;
	}
}
