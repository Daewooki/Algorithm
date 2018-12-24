import java.util.Scanner;

public class Main{
	static int data[];
	static int dataSize;
	static int step;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		dataSize = sc.nextInt();
		if (dataSize < 0 || dataSize > 1000) {
			System.exit(1);
		}
		data = new int[dataSize];
		step = sc.nextInt();

		for (int i = 0; i < dataSize; i++) {
			data[i] = sc.nextInt();
			if (data[i] > 1000 || data[i] < -1000) {
				System.exit(1);
			}
		}
		selectionSort(data, step);
	}

	static void selectionSort(int data[], int step) {
		int size = data.length;
		int min;
		int temp;

		for (int i = 0; i < step; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;

		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
