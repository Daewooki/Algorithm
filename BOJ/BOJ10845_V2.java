import java.util.*;

public class BOJ10845_V2 {
	static int size = 0;
	static Node head = new Node(0);
	static Node back;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			String line = sc.nextLine();
			if (line.startsWith("push")) {
				String field[];
				field = line.split(" ");
				int data = Integer.parseInt(field[1]);
				push(data);
			} else if (line.startsWith("front")) {
				front();
			} else if (line.startsWith("size")) {
				size();
			} else if (line.startsWith("pop")) {
				pop();
			} else if (line.startsWith("empty")) {
				empty();
			} else if (line.startsWith("back")) {
				back();
			}
		}
		sc.close();
	}

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void push(int data) {
		Node newNode = new Node(data);
		if (head.next == null) {
			head.next = newNode;
			back = newNode;
			size++;
		} else {
			Node tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			back = newNode;
			size++;
		}
	}

	public static void pop() {
		if (size < 1) {
			System.out.println("-1");
		} else {
			Node tempNode = head.next;
			System.out.println(tempNode.data);
			head.next = tempNode.next;
			size--;
		}
	}

	public static void size() {
		System.out.println(size);
	}

	public static void empty() {
		if (size < 1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static void front() {
		if (size < 1) {
			System.out.println("-1");
		} else {
			System.out.println(head.next.data);
		}
	}

	public static void back() {
		if (size < 1) {
			System.out.println("-1");
		} else {
			System.out.println(back.data);
		}
	}
}
