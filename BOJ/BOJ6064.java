import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6064 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		String reader="";
		String field[];

		for(int line = 0; line <cnt; line++) {
			reader = br.readLine();
			field= reader.split(" ");
			int M = Integer.parseInt(field[0]);
			int N = Integer.parseInt(field[1]);
			
			int x = Integer.parseInt(field[2]);
			int y = Integer.parseInt(field[3]);
			
			int lcm = lcm(M,N);
			while(true) {
				if(x > lcm || (x - 1) % N + 1 == y) {
					break;
				}
				x+=M;
			}
			
			if (x > lcm) {
				System.out.println("-1");
			}else {
				System.out.println(x);
			}
		}
		br.close();
	}
	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int r = a % b;
	        a = b;
	        b = r;
	    }
	    return a;
	}
	 
	public static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}
}


