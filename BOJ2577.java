import java.util.Scanner;

public class BOJ2577 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int result = A * B * C;
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int zari = 0;
		while (result > 9) {
			zari = result % 10;
			arr[zari]++;
			result = result/10;
		}
		arr[result]++;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
