import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i = 0; i<line; i++) {
			ar.add(Integer.parseInt(br.readLine()));
		}
		
		int idx = 0; 
		int val = 1;
		
		while(idx<ar.size()) {
			if(stack.size()==0) {
				stack.push(val);
				val++;
				sb.append("+\n");
				if(stack.peek().equals(ar.get(idx))) {
					stack.pop();
					sb.append("-\n");
					idx++;
				}
			}else {
				if(ar.get(idx)>stack.peek()) {
					stack.push(val);
					val++;
					sb.append("+\n");
					if(stack.peek().equals(ar.get(idx))) {
						stack.pop();
						sb.append("-\n");
						idx++;
					}
				}else if(ar.get(idx).equals(stack.peek())) {
					stack.pop();
					sb.append("-\n");
					idx++;
				}else if(ar.get(idx)<stack.peek()) {
					System.out.println("NO");
					sb.setLength(0);;
					break;
				}
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}
