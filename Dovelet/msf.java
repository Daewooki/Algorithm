import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class M1376 {
	static int vertexSize;
	static int startVertex;
	static int edgeSize;
	static int visited[];
	static int graph[][];
	static Queue<Integer> q = new LinkedList<Integer>();
	static Stack<Integer> stack = new Stack<Integer>();

	// 5 6 1 2 1 4 1 3 3 2 3 4 2 5 // 7 8 1 2 1 4 1 3 3 2 3 4 2 5 5 6 6 7 // 9 10 1 2 1 4 1 3 3 2 3 4 2 5 5 6 6 7 5 8 8 9
	// 9 9 1 2 2 4 4 7 7 8 8 9 6 8 6 9 5 6 3 5 //6
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		vertexSize = sc.nextInt();
		edgeSize = sc.nextInt();
		graph = new int[vertexSize + 1][vertexSize + 1];
		visited = new int[10000001];

		int first, second;
		for (int i = 0; i < edgeSize; i++) {
			first = sc.nextInt();
			second = sc.nextInt();
			graph[first][second] = graph[second][first] = 1;
		}

		for (int i = 0; i < visited.length; i++) {
			visited[i] = 0;
		}
		MFS(1);
		while (!(q.isEmpty())) {
			int temp = q.poll();
			System.out.print(temp + " ");
		}

	}

	public static void MFS(int startVertex) {
		visited[startVertex] = 1;
		System.out.println("<1>=====start : " + startVertex);
		System.out.println("<2>");		

		for (int i = 1; i <= vertexSize; i++) {
			System.out.println("visisted " + i + " :" + visited[i]);
		}

		if (q.contains(startVertex) == false) {
			q.offer(startVertex);
		}

		stack.push(startVertex);
		int count = 0;
		int temp[] = new int[10000001];

		for (int i = 1; i <= vertexSize; i++) {
			if (graph[startVertex][i] == 1 && visited[i] == 0) {
				temp[count] = i;
				count++;
			}
		}
		if (count == 0) {
			if (stack.isEmpty()) {
				System.exit(1);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
				} else {
					temp[0] = stack.pop();
					MFS(temp[0]);
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println("<3>인접이 있을 때 인접정점은? : " + temp[i]);
		}

		for (int i = 1; i <= vertexSize; i++) {
			if (graph[startVertex][i] == 1 && visited[i] == 0) {
				if (count != 0 && count % 2 == 0) {
					System.out.println("<4>짝수 temp : " + temp[0]);
					MFS(temp[0]);
				} else if (count == 1) {
					System.out.println("<4>temp 1개일때 : " + temp[0]);
					MFS(temp[0]);
				} else{
					System.out.println("<4>홀수 temp: " + temp[count / 2]);
					MFS(temp[count / 2]);
				}
			}
		}
	}
}
