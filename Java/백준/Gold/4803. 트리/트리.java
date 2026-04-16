import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static boolean isCycle;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = 1;
        while (true) {
            String input = br.readLine();

            StringTokenizer st = new StringTokenizer(input);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            visited = new boolean[n + 1];
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            int treeCount = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    isCycle = false;
                    dfs(i, 0); // 시작
                    if (!isCycle)
                        treeCount++; // 사이클 없으면 가능한 트리 수 계산
                }
            }

            System.out.print("Case " + caseNum + ": ");
            if (treeCount == 0) {
                System.out.println("No trees.");
            } else if (treeCount == 1) {
                System.out.println("There is one tree.");
            } else {
                System.out.println("A forest of " + treeCount + " trees.");
            }
            caseNum++;
        }
    }

    public static void dfs(int now, int parent) {
        visited[now] = true; // 지금 방문한 노드 체크!

        for (int next : graph[now]) {
            if (!visited[next]) {
                //  노드 계속 파고들기
                dfs(next, now);
            } else if (next != parent) {
                isCycle = true;
            }
        }
    }
}