package level0;
import java.util.*;

public class PG_120804 {
    public static void main(String[] args) {
        int n = 5;
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가: {도착노드, 가중치}
        graph.get(0).add(new int[]{1, 2});
        graph.get(0).add(new int[]{2, 5});
        graph.get(1).add(new int[]{0, 2});
        graph.get(1).add(new int[]{2, 3});
        graph.get(1).add(new int[]{3, 1});
        graph.get(2).add(new int[]{0, 5});
        graph.get(2).add(new int[]{1, 3});
        graph.get(2).add(new int[]{3, 4});
        graph.get(2).add(new int[]{4, 2});
        graph.get(3).add(new int[]{1, 1});
        graph.get(3).add(new int[]{2, 4});
        graph.get(3).add(new int[]{4, 6});
        graph.get(4).add(new int[]{2, 2});
        graph.get(4).add(new int[]{3, 6});

        int start = 4; // 5번 노드에서 시작 (0-indexed)
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        // {거리, 노드}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, start});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curDist = cur[0];
            int curNode = cur[1];

            if (curDist > dist[curNode]) continue;

            for (int[] next : graph.get(curNode)) {
                int nextNode = next[0];
                int nextDist = curDist + next[1];

                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.offer(new int[]{nextDist, nextNode});
                }
            }
        }

        System.out.println("=== 우선순위 큐 방식 (시작: 5번 노드) ===");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번 노드까지 거리: " + dist[i]);
        }
    }
}
