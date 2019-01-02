import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char ar[] = n.toCharArray();

		for (int i = 0; i < ar.length; i++) {
			if (i>0&&i % 10 == 0) {
				System.out.println("");
			}
			System.out.print(ar[i]);
		}

		sc.close();

	}
}
