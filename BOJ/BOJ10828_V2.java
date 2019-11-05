import java.util.*;

public class BOJ10828 {
	static Node head = new Node(0);
	static int size = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			String line = sc.nextLine();
			if (line.startsWith("push")) {
				String field[];
				field = line.split(" ");
				int data = Integer.parseInt(field[1]);
				Push(data);
			} else if (line.startsWith("top")) {
				Top();
			} else if (line.startsWith("size")) {
				System.out.println(size);
			} else if (line.startsWith("pop")) {
				Pop();
			} else if (line.startsWith("empty")) {
				System.out.println(empty(head));
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

	public static void Push(int data) {
		Node node = new Node(data);
		if (head.next == null) {
			head.next = node;
			size++;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}

	public static void Pop() {
		if (head.next == null) {
			System.out.println("-1");
		} else {
			Node preNode;
			Node postNode;
			preNode = head;
			postNode = head.next;
			while (postNode.next != null) {
				preNode = postNode;
				postNode = postNode.next;
			}
			System.out.println(postNode.data);
			preNode.next = null;

			if (size > 0) {
				size--;
			}
		}
	}

	public static void Top() {
		if (head.next == null) {
			System.out.println("-1");
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public static int size(Node node) {
		int count = 0;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static int empty(Node node) {
		if (node.next == null) {
			return 1;
		} else {
			return 0;
		}
	}
}
