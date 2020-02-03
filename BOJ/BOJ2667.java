import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ2667 {
	static int num;
	static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int cnt;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());
		int[][] matrix = new int[num][num];
		boolean[][] visited = new boolean[num][num];
		for (int i = 0; i < num; i++) {
			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				matrix[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				visited[i][j] = false;
			}
		}

		ArrayList<Integer> cnts = new ArrayList<>();

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1 && visited[i][j] == false) {
					cnt = 0;
					DFS(i, j, visited, matrix);
					cnts.add(cnt);
				}
			}
		}

		Collections.sort(cnts);

		System.out.println(cnts.size());
		for (int i = 0; i < cnts.size(); i++) {
			System.out.println(cnts.get(i));
		}

	}

	private static void DFS(int i, int j, boolean[][] visited, int[][] matrix) {
		visited[i][j] = true;
		cnt++;
		
		for(int k=0; k<4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
 
            if(0 <= nx && nx < num && 0 <= ny && ny < num) {
                if(matrix[nx][ny] == 1 && visited[nx][ny] == false) {
                	DFS(nx, ny, visited, matrix);
                }
            }
        }
	}
}
