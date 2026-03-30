import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            // 절댓값이 같다면
            if (Math.abs(a) == Math.abs(b)) {
                return a - b;
            }
            // 다른 숫자면
            return Math.abs(a) - Math.abs(b);
        });

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0)
                pq.add(input);
            if (input == 0) {
                if (pq.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(pq.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}