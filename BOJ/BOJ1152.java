import java.util.Scanner;

public class BOJ1152 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String field[];
		field = input.split(" ");
		int count = 0;
		for(int i=0; i<field.length; i++) {
			if(!field[i].equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
