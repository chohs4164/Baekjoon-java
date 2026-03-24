import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine()); // 카드의 갯수
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            queue.pollFirst(); //제일 위애 있는 카드 하나 버리고
            queue.offerLast(queue.pollFirst()); // 그 다음 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
        }
        //하나가 남았을텐데
        System.out.println(queue.pollFirst());
    }
}
