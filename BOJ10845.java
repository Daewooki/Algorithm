import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		ArrayList<Integer> que = new ArrayList<>();
		
		String reader = "";
		String field[];
		
		for(int i = 0; i<num; i++) {
			reader = br.readLine();
			if(reader.startsWith("push")) {
				field = reader.split(" ");
				que.add(Integer.parseInt(field[1]));
			}else if(reader.startsWith("front")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(que.get(0));
				}
			}else if(reader.startsWith("back")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(que.get(que.size()-1));
				}
			}else if(reader.startsWith("size")) {
				System.out.println(que.size());
			}else if(reader.startsWith("empty")) {
				if(que.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(reader.startsWith("pop")) {
				if(que.size()==0) {
					System.out.println("-1");
				}else {
					System.out.println(que.get(0));
					que.remove(0);
				}
			}
		}
		br.close();
	}
}
