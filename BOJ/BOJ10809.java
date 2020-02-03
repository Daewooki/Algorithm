import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int array[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1 };
		String reader = "";
		reader = br.readLine();

		char st[] = reader.toCharArray();

		for (int te = 0; te < st.length; te++) {
			if (array[st[te] - 97] == -1) {
				array[st[te]-97] = te;
			}
		}

		
		for(int tz = 0; tz<array.length; tz++) {
			System.out.print(array[tz]+" ");
		}
		br.close();
	}
}
