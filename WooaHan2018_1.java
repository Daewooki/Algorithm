import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		int j = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		int startIdx = 0;
		if(d == 1) {
			System.out.println(list);
			
			while(list.size()!=1) {
				startIdx+=k;
				if(startIdx>=list.size()) {
					startIdx %= list.size();
				}
				System.out.print("out:"+list.get(startIdx) + "    ");
				list.remove(startIdx);
				startIdx--;
				k += j;
				System.out.println("k:"+k);
			}
			System.out.println("last winner : " + list.get(0));
		}
		else if(d==0) {
			List<Integer> revList = new ArrayList<>();
			revList.add(list.remove(0));
			Collections.reverse(list);
			revList.addAll(list);
			System.out.println(revList);
			
			while(revList.size()!=1) {
				startIdx+=k;
				if(startIdx>=revList.size()) {
					startIdx %= revList.size();
				}
				System.out.print("out:"+revList.get(startIdx) + "    ");
				revList.remove(startIdx);
				startIdx--;
				k += j;
				System.out.println("k:"+k);
			}
			System.out.println("last winner : " + revList.get(0));
		}
	sc.close();
	}
}
