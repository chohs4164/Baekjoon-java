import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    static ArrayList<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        parent = new int[N + 1]; // 부모 번호를 저장할 배열
        visited = new boolean[N + 1];
        for (int i = 1; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int node1 = Integer.parseInt(input[0]);
            int node2 = Integer.parseInt(input[1]);
            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int current) {
        visited[current] = true; // 현재 노드 방문 체크

        for (int next : tree[current]) {
            if (!visited[next]) { // 아직 방문하지 않은 노드라면
                parent[next] = current; // 그 노드의 부모는 나
                dfs(next); // 더 아래로 가보자잉
            }
        }
    }
}