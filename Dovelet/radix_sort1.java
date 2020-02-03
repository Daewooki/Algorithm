import java.util.LinkedList;
import java.util.Scanner;

public class RadixSort1 {
	static LinkedList<Integer>[] bucket;
	static int data[];
	static int dataSize;

	static int factor = 1;

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		dataSize = sc.nextInt();
		if (dataSize > 10000) {
			System.exit(1);
		}
		bucket = new LinkedList[] { new LinkedList<Integer>(), new LinkedList<Integer>(), new LinkedList<Integer>(),
				new LinkedList<Integer>(), new LinkedList<Integer>(), new LinkedList<Integer>(),
				new LinkedList<Integer>(), new LinkedList<Integer>(), new LinkedList<Integer>(),
				new LinkedList<Integer>() };

		data = new int[dataSize];

		for (int i = 0; i < dataSize; i++) {
			data[i] = sc.nextInt();
			if (data[i] > 100000) {
				System.exit(1);
			}
		}
		radixSort(data);
		for (int u = 0; u < data.length; u++) {
			System.out.print(data[u] + " ");
		}
	}

	static void radixSort(int data[]) {
		int mod = 10;
		int dev = 1;
		for (int i = 0; i < data.length; i++, mod *= 10, dev *= 10) {
			for (int j = 0; j < data.length; j++) {
				int temp = (data[j] % mod) / dev;
				bucket[temp].add(data[j]);
			}
			int pos = 0;
			for (int j = 0; j < data.length; j++) {
				Integer value = null;
				while ((value = bucket[j].poll()) != null) {
					data[pos++] = value;
				}
			}
		}
	}

}
