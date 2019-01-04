import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		int array[] = { 0, 0 };
		if (Integer.parseInt(num) < 10) {
			char[] soo = num.toCharArray();
			array[0] = 0;
			array[1] = soo[0] - 48;
		} else {
			char[] soo = num.toCharArray();
			array[0] = soo[0] - 48;
			array[1] = soo[1] - 48;
		}

		int tnum = (array[0] + array[1])%10;
		String temp = "";
		int count = 1;
		while (true) {
			temp = array[1] + "" + tnum;
			if (Integer.parseInt(num)==Integer.parseInt((temp))) {
				break;
			} else {
				char[] soo = temp.toCharArray();
				array[0] = soo[0] - 48;
				array[1] = soo[1] - 48;
				tnum = (array[0] + array[1])%10;
				count++;
			}
		}
		System.out.println(count);
	}
}
