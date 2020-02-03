import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String field[];
		int a, b;
		int c = 0;
		for (int i = 0; i < num; i++) {
			field = br.readLine().split(" ");
			a = Integer.parseInt(field[0]);
			b = Integer.parseInt(field[1]);
			c=a+b;
			bw.write(c+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
