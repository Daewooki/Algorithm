import java.util.Scanner;

/**
 * @author wook
 *
 */
public class BOJ9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		int[] arr = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for (int i = 4; i < arr.length; i++) {
			int sum = arr[i - 3] + arr[i - 2] + arr[i - 1];
			arr[i] = sum;
		}
		
		
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			System.out.println(arr[num]);
		}
		sc.close();
	}
}
