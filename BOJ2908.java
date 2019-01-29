import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String field[] = br.readLine().split(" ");
		
		String a = field[0];
		String b= field[1];
		
		StringBuffer sba = new StringBuffer(a);
		StringBuffer sbb = new StringBuffer(b);
		a = sba.reverse().toString();
		b = sbb.reverse().toString();
		
		int numa = Integer.parseInt(a);
		int numb = Integer.parseInt(b);
		
		if(numa > numb) {
			System.out.println(numa);
		}else {
			System.out.println(numb);
		}
		
		br.close();
	}
}
