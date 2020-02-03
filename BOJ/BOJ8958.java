import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String reader ="";
		reader = br.readLine();
		
		int que = Integer.parseInt(reader);
		for(int i=0; i<que; i++) {
			reader = br.readLine();
			int score = 0;
			int pos=0;
			int state = 0;
			while(pos<reader.length()) {
				while(reader.charAt(pos)=='O') {
					state++;
					score+=state;
					pos++;
					if(pos>=reader.length()) {
						break;
					}
				}
				state=0;
				pos++;
			}
			System.out.println(score);
		}
		br.close();
	}
}
