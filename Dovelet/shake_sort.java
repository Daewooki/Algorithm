import java.util.Scanner;

public class Main{
	static int dataSize;
	static int data[];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		dataSize = sc.nextInt();
		if (dataSize < 0 || dataSize > 1000) {
			System.exit(1);
		}
		data = new int[dataSize];

		for (int i = 0; i < dataSize; i++) {
			data[i] = sc.nextInt();
			if (data[i] > 1000 || data[i] < -1000) {
				System.exit(1);
			}
		}
		shakeSort(data);
	}

	static void shakeSort(int data[]) {
		int count = 0;
		int shift = 0;
		int low = 0, high = data.length - 1;
		while (low < high) {
			for (int i = low; i < high; i++) {
				if (data[i] > data[i + 1]) {
					int temp;
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					shift = i;
				}
			}
			high = shift;
			for (int i = high; i > low; i--) {
				if (data[i] < data[i - 1]) {
					int temp;
					temp = data[i];
					data[i] = data[i - 1];
					data[i - 1] = temp;
					shift = i;
				}
			}
			low = shift;
			count++;
			if(low>=high) {
				break;
			}
		}
		System.out.print(count);
	}
}
