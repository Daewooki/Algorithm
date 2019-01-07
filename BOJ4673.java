import java.io.IOException;

public class BOJ4673 {
	public static void main(String args[]) throws IOException {
		boolean[] num = new boolean[10001];
		for(int i= 1; i<=10000; i++) {
			int temp = d(i);
			if(temp<=10000) {
				num[temp] = true;
			}
		}
		for(int i=1; i<num.length; i++) {
			if(!num[i]) {
				System.out.println(i);
			}
		}
	}
	static int d(int pre) {
		String tostring = Integer.toString(pre);
		int result = 0;
		result += pre;
		for(int i=0; i<tostring.length();i++) {
			result+=tostring.charAt(i)-48;
		}
		return result;
	}
}
