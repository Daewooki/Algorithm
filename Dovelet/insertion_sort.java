import java.util.Scanner;

public class Main{
	static int dataSize;
	static int step;
	static int data[];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		dataSize = sc.nextInt();
		if (dataSize > 1000 || dataSize < 0) {
			System.exit(1);
		}
		data = new int[dataSize];
		step = sc.nextInt();
		if (step < 0 || step > dataSize) {
			System.exit(1);
		}

		for (int i = 0; i < dataSize; i++) {
			data[i] = sc.nextInt();
			if (data[i] < -1000 || data[i] > 1000) {
				System.exit(1);
			}
		}

		insertion_sort(data, step);
	}

	static void insertion_sort(int data[], int step) {
		int i, key;
		
			for (int j = 1; j < step; j++) {
				key = data[j];
				i = j - 1;
				while (i >= 0 && data[i] > key) {
					data[i + 1] = data[i];
					i = i - 1;
				}
				data[i + 1] = key;
			}
		

		for (int k = 0; k < data.length; k++) {
			System.out.print(data[k] + " ");
		}
	}
}
