import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ1546 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Double> score = new ArrayList<>();
		List<Double> newScore = new ArrayList<>();
				
		for(int i=0; i<N; i++) {
			score.add(sc.nextDouble());
		}
		Collections.sort(score);
		double max = score.get(score.size()-1);
		
		for(int i=0; i<score.size(); i++) {
			newScore.add((score.get(i)/max)*100);
		}
		
		double sum = 0;
		for(int i=0; i<newScore.size(); i++) {
			sum += newScore.get(i);
		}
		System.out.println(String.format("%.2f", sum/newScore.size()));
		
		sc.close();
	}
}
