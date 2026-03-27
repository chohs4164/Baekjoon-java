import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
        for (int i = 0; i < T; i++) {
            Deque<String> deque = new ArrayDeque<>();
            char[] input = br.readLine().toCharArray(); // R과 D의 조합
            int num = Integer.parseInt(br.readLine()); // 배열 내의 숫자의 갯수
            String[] arr = br.readLine().replace("[", "").replace("]", "").split(","); // 배열의 요소들
            deque.addAll(Arrays.asList(arr).subList(0, num));
            boolean isReversed = false;
            boolean isError = false;
            for (char c : input) {
                switch (c) {
                    case 'R': // 뒤집기
                        isReversed = !isReversed;
                        break;
                    case 'D': // 버리기
                        if (deque.isEmpty())
                            isError = true;
                        else {
                            if (!isReversed)
                                deque.pollFirst();
                            else if (isReversed)
                                deque.pollLast();
                        }
                        break;
                }
            }
            if (isError) {
                sb.append("error\n");
            } else {
                StringJoiner sj = new StringJoiner(",", "[", "]");
                if (!isReversed) {
                    while (!deque.isEmpty()) {
                        sj.add(deque.pollFirst());
                    }
                } else {
                    while (!deque.isEmpty()) {
                        sj.add(deque.pollLast());
                    }
                }
                sb.append(sj.toString()).append("\n");
            }
        }
        System.out.println(sb);
    }
}