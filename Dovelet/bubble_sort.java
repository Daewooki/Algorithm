import java.util.Scanner;

public class Main{
	static int dataSize;
	static int step;
	static int data[];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		dataSize = sc.nextInt();
		if (dataSize < 1 || dataSize > 1000) {
			System.exit(1);
		}
		data = new int[dataSize];
		step = sc.nextInt();
		if (step < 1 || step > dataSize) {
			System.exit(1);
		}
		for (int i = 0; i < dataSize; i++) {
			data[i] = sc.nextInt();
		}
		bubbleSort(data, step);
	}
	static void bubbleSort(int data[], int step) {
		for (int j = 0; j < step; j++) {
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i + 1]) {
					int temp;
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
				}
			}
		}
		for(int i =0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
}
