public class Dijkstra {

	public int n = 0; // ������ ����
	final static int maxdistance = 30000; // �ִ� �Ÿ�
	public int data[][]; // ��ü �Ÿ� ���

	public boolean visit[]; // �湮�� Ȯ��
	public int dis[]; // ������ ������ �Ÿ�
	public int prev[]; // ������ ���� ���� ����

	public int s, e; // �������� ���� ����
	public int path[]; // ���������� ���������� ���� ����

	public void init(int dataI[][]) // �� ������ ������ �ʱ�ȭ
	{
		data = dataI;
		n = data.length;

		dis = new int[n];
		visit = new boolean[n];
		prev = new int[n];
		path = new int[n];
	}

	public void start(int start, int end) {
		s = start;
		e = end;

		int min = 0;

		int tmp = e - 1; // �ε����� -1
		int firstout = 0;

		// �ʱ�ȭ
		for (int i = 0; i < n; i++) {
			dis[i] = maxdistance; // �Ÿ��ִ��
			prev[i] = 0; // ������� 0����
			visit[i] = false; // �湮 false��
		}

		dis[s - 1] = 0; // ���� 0
		
		int k = 0;
		for (int i = 0; i < n; i ++) {
			min = maxdistance;
			
			for (int j = 0; j < n; j++) {
				if (dis[k] + data[k][j] < dis[j]) {
					dis[j] = dis[k] + data[k][j]; // �ִܰŸ� ����
					prev[j] = k; // J�� ���� ���ؼ��� K�� ���ľ� ��
				} else if (visit[j] == false && dis[j] < min) { // Ȯ������ �ʰ� �Ÿ��� ª�� ������ ã��
					k = j;
					min = dis[j];
				}
			}
			visit[k] = true;
		}
		// ����� ���� ������ ����
		// if (min == maxdistance)
		// break;

		// ����� ���� ���� �� ���� ó��.
		// while (!(prev[e] == 0)) {
		while (true) {
			if (min == maxdistance) {
				System.out.println("����� �� ����.");
				break;
			}
			path[firstout] = tmp + 1;
			if (tmp == s - 1)
				break; // �������� �̸������� ����
			tmp = prev[tmp];
			firstout++;
		}

		// ������ ��� ���
		for (int i = firstout; i > -1; i--) {
			if (min == maxdistance) {
				break;
			} else {
				System.out.printf("%d", path[i]);
				if (i != 0) {
					System.out.printf(" -> ");
				}

			}
		}
		System.out.println("");

	}
}
