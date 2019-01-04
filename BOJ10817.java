import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ10817 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		Collections.sort(ar);
		
		System.out.println(ar.get(1));
		sc.close();
	}
}
