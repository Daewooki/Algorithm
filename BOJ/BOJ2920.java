import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ2920 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String reader = "";
		reader = br.readLine();
		String field[];
		field = reader.split(" ");

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < field.length; i++) {
			arr.add(Integer.parseInt(field[i]));
		}

		int start = arr.get(0);
		int max = 8;
		int min = 1;
		for (int i = 1; i < arr.size(); i++) {
			if (start == max) {
				if (start - 1 == arr.get(i)) {
					max--;
					start = arr.get(i);
					if(start==min) {
						System.out.println("descending");
						break;
					}
				} else {
					System.out.println("mixed");
					break;
				}
			} else if (start == min) {
				if (start + 1 == arr.get(i)) {
					min++;
					start = arr.get(i);
					if(start==max) {
						System.out.println("ascending");
						break;
					}
				} else {
					System.out.println("mixed");
					break;
				}
			} else {
				System.out.println("mixed");
				break;
			}
		}
		br.close();
	}
}
