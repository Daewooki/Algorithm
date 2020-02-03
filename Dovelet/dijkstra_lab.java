public class Dijkstra {

	public int n = 0; // 정점의 갯수
	final static int maxdistance = 30000; // 최대 거리
	public int data[][]; // 전체 거리 행렬

	public boolean visit[]; // 방문지 확인
	public int dis[]; // 시작점 부터의 거리
	public int prev[]; // 도착점 전의 정점 저장

	public int s, e; // 시작점과 끝점 저장
	public int path[]; // 시작점부터 끝점까지의 순서 저장

	public void init(int dataI[][]) // 각 변수들 사이즈 초기화
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

		int tmp = e - 1; // 인덱스라 -1
		int firstout = 0;

		// 초기화
		for (int i = 0; i < n; i++) {
			dis[i] = maxdistance; // 거리최대로
			prev[i] = 0; // 이전노드 0으로
			visit[i] = false; // 방문 false로
		}

		dis[s - 1] = 0; // 시작 0
		
		int k = 0;
		for (int i = 0; i < n; i ++) {
			min = maxdistance;
			
			for (int j = 0; j < n; j++) {
				if (dis[k] + data[k][j] < dis[j]) {
					dis[j] = dis[k] + data[k][j]; // 최단거리 저장
					prev[j] = k; // J로 가기 위해서는 K를 거쳐야 함
				} else if (visit[j] == false && dis[j] < min) { // 확인하지 않고 거리가 짧은 정점을 찾음
					k = j;
					min = dis[j];
				}
			}
			visit[k] = true;
		}
		// 연결된 곳이 없으면 종료
		// if (min == maxdistance)
		// break;

		// 연결된 곳이 없을 때 에러 처리.
		// while (!(prev[e] == 0)) {
		while (true) {
			if (min == maxdistance) {
				System.out.println("연결된 곳 없음.");
				break;
			}
			path[firstout] = tmp + 1;
			if (tmp == s - 1)
				break; // 시작점에 이르렀으면 종료
			tmp = prev[tmp];
			firstout++;
		}

		// 역추적 결과 출력
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
