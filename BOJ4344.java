import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ4344 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String reader = "";
		String field[];
		
		while((reader=br.readLine())!=null) {
			field=reader.split(" ");
			int n = Integer.parseInt(field[0]);
			ArrayList<Integer> score = new ArrayList<>();
			for(int i=1; i<field.length;i++) {
				score.add(Integer.parseInt(field[i]));
			}
			
			int sum=0,avg=0;
			for(int i=0; i<score.size(); i++) {
				sum += score.get(i);
			}
			avg = sum / score.size();
			
			double count=0;
			for(int i=0; i<score.size(); i++) {
				if(score.get(i)>avg) {
					count++;
				}
			}
			double rate = count/n*100; 
			System.out.println(String.format("%.3f", rate)+"%");
		}
		
		br.close();
	}
}
