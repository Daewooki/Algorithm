import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());// 4
		String func = ""; // RDD
		int arrSize = 0;
		Deque<Integer> arr = new ArrayDeque<>();
		String field[];
		String reader = "";

		for (int i = 0; i < num; i++) {
			int dir = 1; // 1 = toward , 2 = back
			func = br.readLine();
			arrSize = Integer.parseInt(br.readLine());
			if (arrSize == 0) {
				if(func.contains("D")) {
					System.out.println("error");
				}else if(func.contains("R")) {
					System.out.println("[]");
				}
				br.readLine();
			} else if (arrSize == 1) {
				reader = br.readLine();
				reader = reader.substring(1, reader.length() - 1);
				arr.push(Integer.parseInt(reader));
				for (int j = 0; j < func.length(); j++) {
					if (func.charAt(j) == 'D') {
						if (arrSize <= 0) {
							arrSize--;
						} else {
							arr.removeFirst();
							arrSize--;
						}
					}
				}
				
				if (arrSize < 0) {
					System.out.println("error");
				} else if (arrSize == 0) {
					System.out.println("[]");
				} else if (arrSize == 1) {
					System.out.println("[" + arr.pollFirst() + "]");
				}
				arr.clear();
			} else {
				reader = br.readLine();
				field = reader.substring(1, reader.length() - 1).split(",");
				for (int j = 0; j < field.length; j++) {
					arr.push(Integer.parseInt(field[j]));
				}
				for (int j = 0; j < func.length(); j++) {
					if (func.charAt(j) == 'R') {
						if (dir == 1) {
							dir = 2;
						} else if (dir == 2) {
							dir = 1;
						}
					} else if (func.charAt(j) == 'D') {
						if(dir == 1) {
							if(arrSize<=0) {
								arrSize--;
							}else {
							arr.removeLast();
							arrSize--;
							}
						} else if (dir == 2) {
							if(arrSize<=0) {
								arrSize--;
							}else {
							arr.removeFirst();
							arrSize--;
							}
						}
					}
				}
				if (arrSize < 0) {
					System.out.println("error");
				} else if (arrSize == 0) {
					System.out.println("[]");
				} else if (arrSize == 1) {
					System.out.println("[" + arr.pollFirst() + "]");
				} else {
					System.out.print("[");
					if (dir == 2) {
						for (int j = 0; j < arrSize - 1; j++) {
							System.out.print(arr.pollFirst() + ",");
						}
						System.out.print(arr.pollFirst() + "]\n");
					} else if (dir == 1) {
						for (int j = 0; j < arrSize - 1; j++) {
							System.out.print(arr.pollLast() + ",");
						}
						System.out.print(arr.pollFirst() + "]\n");
					}
				}
				arr.clear();
			}
		}
		br.close();
	}
}
