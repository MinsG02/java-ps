package Check;
import java.util.*;

public class PG_Train {
    public static void main(String[] args) {
        int n = 5; // 노드 수
        int[][] graph = {
                {0, 2, 5, 0, 0},
                {2, 0, 3, 1, 0},
                {5, 3, 0, 4, 2},
                {0, 1, 4, 0, 6},
                {0, 0, 2, 6, 0}
        }; // 0은 연결 없음

        int start = 0;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n; i++) {
            int minDist = Integer.MAX_VALUE;
            int minNode = -1;

            // 최소 거리 노드 찾기
            for (int j = 0; j < n; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    minNode = j;
                }
            }

            if (minNode == -1) break;
            visited[minNode] = true;

            // 거리 갱신
            for (int j = 0; j < n; j++) {
                if (graph[minNode][j] > 0 && !visited[j]) {
                    dist[j] = Math.min(dist[j], dist[minNode] + graph[minNode][j]);
                }
            }
        }

        System.out.println("=== 배열 방식 (시작: 1번 노드) ===");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번 노드까지 거리: " + dist[i]);
        }
    }
}
