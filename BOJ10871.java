import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ10871 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int j = sc.nextInt();
			if(j<X) {
				System.out.print(j+" ");
			}
		}
		sc.close();
	}
}
