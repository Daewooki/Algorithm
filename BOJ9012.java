import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		Stack<Character> stack = new Stack<>();
		
		String reader = "";
		
		for(int i = 0 ; i<num; i++) {
			int pair = 0;
			reader = br.readLine();
			for(int j=0; j<reader.length(); j++) {
				stack.push(reader.charAt(j));
			}

			if(stack.peek()==('(')) {
				System.out.println("NO");
				stack.clear();
			}else {
				while(!stack.isEmpty()) {
					char pop = stack.pop();
					if(pop=='('){
						pair-=1;
						if(pair<0) {
							stack.clear();
							break;
						}
					}else if(pop==')') {
						pair+=1;
					}
				}
				if(pair == 0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				pair=0;
			}
		}
		br.close();
	}
}
