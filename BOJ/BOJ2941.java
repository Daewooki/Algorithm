import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException {
		String value[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=", "a", "b", "c", "d", "e", "f", "g", "h", "i",
				"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < value.length; i++) {
			map.put(value[i], value[i]);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reader = br.readLine();

		String line = "";
		int count = 0;
		int idx = 0;
		while (idx != reader.length()) {
			line += reader.charAt(idx) + "";
			if (line.equals("-") || line.equals("=")) {
				idx++;
				line = "";
			} else if (map.containsKey(line)) {
				if (idx == reader.length() - 1) {
					count++;
					break;
				}
				idx++;
			} else if (!map.containsKey(line)) {
				if (line.equals("dz")) {
					idx++;
					line+=reader.charAt(idx)+"";
					if(line.equals("dz=")) {
						count++;
						line="";
					}else {
						count+=1;
					}
				} else {
					line = "";
					count++;
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}
