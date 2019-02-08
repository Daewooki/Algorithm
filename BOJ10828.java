import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reader = br.readLine();
		
		Stack<Integer> stack = new Stack<>();

		while((reader=br.readLine())!=null){
			if(reader.startsWith("push")) {
				String field[] = reader.split(" ");
				stack.add(Integer.parseInt(field[1]));
			}else if(reader.startsWith("top")) {
				if(stack.size()>0) {
					System.out.println(stack.peek());
				}else {
					System.out.println("-1");
				}
			}else if(reader.startsWith("size")) {
				System.out.println(stack.size());
			}else if(reader.startsWith("empty")) {
				if(stack.size()>0) {
					System.out.println("0");
				}else {
					System.out.println("1");
				}
			}else if(reader.startsWith("pop")) {
				if(stack.size()>0) {
					System.out.println(stack.pop());
				}else {
					System.out.println("-1");
				}
			}
		}
		br.close();
	}
}
