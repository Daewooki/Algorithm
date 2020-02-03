import java.util.Scanner;

public class HeapSort {
	static int heap[];
	static int number;
	static int max;
	static int dataSize;
	static int heapSize;
	static int i;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		dataSize = sc.nextInt();
		if (dataSize > 1000) {
			System.exit(1);
		}
		heap = new int[dataSize + 1];
		heapSize = 0;
		for (int i = 0; i < dataSize; i++) {
			number = sc.nextInt();
			insert_heap(number);
		}
		for (int j = 1; j < heap.length; j++) {
			System.out.print(heap[j] + " ");
		}
		System.out.println("");
	}

	static void insert_heap(int item) {
		int i;
		i = ++heapSize;
		while ((i != 1) && (item > heap[i / 2])) {
			heap[i] = heap[i / 2];
			i /= 2;
		}
		heap[i] = item;
	}

	static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	static void secondHeap(int data[], int n) {
		int i, temp;
		for(i = n-1; i>n-4; i--) {
			temp = heap[i];
			heap[i] = heap[0];
			heap[0] = temp;
			secondHeap(heap,i);
		}
	}

}
