import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Edge {
    int to; // 어디로 연결되어 가는지
    int cost; // 가중치

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    int getTo() {
        return this.to;
    }

    int getCost() {
        return this.cost;
    }
}

class Main {
    static ArrayList<Edge>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // 연결된 노드 사이의 거리 입력
        for (int j = 0; j < N - 1; j++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            int cost = Integer.parseInt(input[2]);
            tree[u].add(new Edge(v, cost));
            tree[v].add(new Edge(u, cost));
        }
        for (int k = 0; k < M; k++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int distance = dfs(a, b, 0);
            sb.append(distance).append("\n");
        }
        System.out.println(sb);
    }

    static int dfs(int current, int target, int parent) {
        // 만약 거리를 알고자 했던 노드에 도착했다면
        if (current == target) return 0;

        for (Edge next : tree[current]) {
            if (next.to == parent) continue;

            int result = dfs(next.to, target, current);

            if (result != -1) {
                return result + next.cost;
            }
        }
        return -1;
    }
}