import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;
        int N = Integer.parseInt(br.readLine());
        // 값을 저장하고
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }
        // 나의 오른쪽을 보면서 탐색
        for (int j = 0; j < N; j++) {
            int now = list.get(j);
            // 나보다 작은 값들은 다 쳐내
            while (!stack.isEmpty() && stack.peek() <= now) {
                stack.pop();
            }
            sum += stack.size();
            stack.push(now);
        }
        System.out.println(sum);
    }
}
