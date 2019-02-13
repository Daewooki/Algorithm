import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException {
		int A[] = {5,4,0,3,1,6,2};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		//put data into map.
		for(int i=0; i<A.length; i++) {
			map.put(i, A[i]);
		}
		
		int maxCnt = 0;
		
		int startKey = 0;
		int value = 0;
		int tempIdx = 0;
		
		int cnt = 0;

    if(map.size()==0) {
			System.out.println("0");
		}else {
			while(!map.isEmpty()) {
				cnt=0;
				Iterator<Integer> i = map.keySet().iterator();
				startKey = i.next();  //0
				value = map.get(startKey);  //5
				System.out.println("startKey : " + startKey);
				System.out.println("value : " + value);
				tempIdx = value;   //5
				System.out.println("tempIdx: " + tempIdx);
				//map.remove(startKey);
				i.remove();
				cnt++;
				while(startKey!=tempIdx) {
					System.out.println(startKey + " || " + tempIdx);
					value = map.get(tempIdx);
					System.out.println("value : " + value);
					map.remove(tempIdx);
					//i.remove();
					tempIdx = value;
					System.out.println("tempIdx: " + tempIdx);
					Iterator<Integer> k = map.keySet().iterator();
					while(k.hasNext()) {
						int num = k.next();
						System.out.println("key: " + num + " value : " + map.get(num));
					}
					cnt++;
				}
				if(cnt>=maxCnt) {
					maxCnt = cnt;
				}
			}
			System.out.println(maxCnt);
		}
	}
}
