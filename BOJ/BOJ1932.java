import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1932 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String reader = "";
		String field[];

		int num = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[num+1][num+1];
		int result [][] = new int[num+1][num+1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = 0;
				result[i][j] = 0;
			}
		}
		
		for(int i=0; i<num; i++) {
			reader = br.readLine();
			field = reader.split(" ");
			for(int j=0; j<field.length; j++) {
				arr[i+1][j+1] = Integer.parseInt(field[j]);
			}
		}
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println("");
		}*/
		
		result[1][1] = arr[1][1];
		
		for(int i = 2; i<arr.length; i++) {
			for(int j=1; j<i+1; j++) {
				if(j == 1) {
					result[i][j] = result[i-1][j] + arr[i][j];
				}else if(j==i) {
					result[i][j]=result[i-1][j-1] + arr[i][j];
				}else {
					result[i][j] = Math.max(result[i-1][j-1], result[i-1][j]) + arr[i][j];
				}
			}
		}
		
		int max = 0;
		for(int i=0; i<num+1; i++) {
			if(max<result[num][i]) {
				max = result[num][i];
			}
		}
		System.out.println(max);
		br.close();
	}
}
