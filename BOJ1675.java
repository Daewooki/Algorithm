import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1675 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			String reader = br.readLine();
			String field[] = reader.split(" ");
			int time = Integer.parseInt(field[0]);
			char[] arr = field[1].toCharArray();

			for (int j = 0; j < arr.length; j++) {
				for (int t = 1; t <= time; t++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");
		}
		br.close();
	}
}
