import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		int alpTime[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reader = br.readLine();
		int time = 0;
		for(int i=0; i<reader.length(); i++) {
			time += alpTime[reader.charAt(i) - 65];
		}
		System.out.println(time);
		br.close();
	}
}
