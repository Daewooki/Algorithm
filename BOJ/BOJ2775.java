import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int matrix[][] = new int[15][14];
		
		for(int i=0; i<=14; i++) {
			matrix[i][0] = 1;
		}
		for(int i=0; i<14; i++) {
			matrix[0][i] = i+1;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=1; j<14; j++) {
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
			}
		}

		for(int i=0; i<num; i++) {
			int floor = Integer.parseInt(br.readLine());
			int step = Integer.parseInt(br.readLine());
			System.out.println(matrix[floor][step-1]);
		}
		
		br.close();
	}
}
