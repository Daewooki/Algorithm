import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int grpWrdCnt = 0;
		for (int i = 0; i < num; i++) {
			String line = br.readLine();
			if (line.length() == 1) {
				grpWrdCnt++;
			} else {
				Map<String, String> map = new HashMap<>();
				char st = line.charAt(0);
				map.put(st + "", null); // a
				for (int j = 1; j < line.length(); j++) {
					if (st != line.charAt(j)) {
						if(map.containsKey(line.charAt(j)+"")) {
							map.clear();
							break;
						}else if(!map.containsKey(line.charAt(j)+"")) {
							map.put(line.charAt(j)+"", null);
							st = line.charAt(j);
							if(j==line.length()-1) {
								grpWrdCnt++;
								map.clear();
								break;
							}
						}
					}else {
						if(j==line.length()-1) {
							grpWrdCnt++;
							map.clear();
							break;
						}
					}
				}
			}
		}

		System.out.println(grpWrdCnt);
		br.close();
	}
}
